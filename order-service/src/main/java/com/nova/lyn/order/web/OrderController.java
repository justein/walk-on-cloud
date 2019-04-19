package com.nova.lyn.order.web;

import com.nova.lyn.order.dto.OrderDTO;
import com.nova.lyn.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 3:35
 * @Version 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/process", method = RequestMethod.PUT)
    public ResponseEntity processOrder(@RequestBody OrderDTO orderDTO) {
        orderService.processOrder(orderDTO);
        return ResponseEntity.ok(HttpEntity.EMPTY);
    }
}
