package com.nova.lyn.order.service.impl;

import com.nova.lyn.order.dao.OrderDAO;
import com.nova.lyn.order.dto.AccountDTO;
import com.nova.lyn.order.dto.OrderDTO;
import com.nova.lyn.order.service.AccountService;
import com.nova.lyn.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 3:45
 * @Version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;
    @Autowired
    private AccountService accountService;

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public int processOrder(OrderDTO orderDTO) {
        String userId = orderDTO.getUserId();
        String commodityCode = orderDTO.getCommodityCode();
        Integer count = orderDTO.getCount();

        Assert.notNull(orderDTO, "orderDTO");
        Assert.notNull(userId, "userId");
        Assert.notNull(commodityCode, "commodityCode");
        Assert.notNull(count, "count");

       int addFlag = orderDAO.addOrder(orderDTO.getUserId(), orderDTO.getCommodityCode(), orderDTO.getCount(),orderDTO.getMoney());

       if (addFlag < 1) {
           throw new RuntimeException("下单异常，请稍后重试");
       }

        ResponseEntity responseEntity = accountService.updateAccount(new AccountDTO(userId,count*20 ));
        System.out.println(responseEntity.getStatusCode() + "===="+responseEntity.getBody());
        return 1;
    }
}
