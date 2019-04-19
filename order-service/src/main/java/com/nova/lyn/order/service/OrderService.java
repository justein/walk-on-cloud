package com.nova.lyn.order.service;

import com.nova.lyn.order.dto.OrderDTO;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 3:42
 * @Version 1.0
 */
public interface OrderService {

    int processOrder(OrderDTO orderDTO);
}
