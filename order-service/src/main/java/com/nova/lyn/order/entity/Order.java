package com.nova.lyn.order.entity;

import lombok.Data;

/**
 * @ClassName Order
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 3:43
 * @Version 1.0
 */
@Data
public class Order {

    private Integer id;

    private String userId;

    private String commodityCode;

    private Integer count;

    private Integer money;
}
