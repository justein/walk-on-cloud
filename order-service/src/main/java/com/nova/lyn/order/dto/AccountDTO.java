package com.nova.lyn.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @ClassName AccountDTO
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 4:44
 * @Version 1.0
 */
@Data
public class AccountDTO {
    private Integer id;

    private String userId;

    private Integer money;

    public AccountDTO(String userId, Integer money) {
        this.userId = userId;
        this.money = money;
    }
}
