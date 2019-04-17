package com.nova.lyn.accountservice.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @ClassName AccountDAO
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/17 0017 下午 3:20
 * @Version 1.0
 */
@Mapper
public interface AccountDAO {

    int updateAccount(@Param("userId")String userId, @Param("money")Integer money);
}
