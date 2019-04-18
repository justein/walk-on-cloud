package com.nova.lyn.accountservice.entity;

import lombok.Data;

/**
 * @ClassName Account
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/18 0018 下午 3:42
 * @Version 1.0
 */

@Data
public class Account {

    private Integer id;

    private String userId;

    private Integer money;
}
