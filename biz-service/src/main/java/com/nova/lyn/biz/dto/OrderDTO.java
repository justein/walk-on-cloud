package com.nova.lyn.biz.dto;

import lombok.Data;

/**
 * @ClassName OrderDTO
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 3:02
 * @Version 1.0
 */
@Data
public class OrderDTO {

    private Integer id;
    private String userId;
    private String commodityCode;
    private Integer count;
    private Integer money;
}
