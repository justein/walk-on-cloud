package com.nova.lyn.biz.service;

import com.nova.lyn.biz.dto.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 2:58
 * @Version 1.0
 */
@FeignClient(name = "order", url = "http://localhost:11182/order")
public interface OrderService {

    @RequestMapping(method = RequestMethod.PUT)
    void createOrder(OrderDTO orderDTO);
}
