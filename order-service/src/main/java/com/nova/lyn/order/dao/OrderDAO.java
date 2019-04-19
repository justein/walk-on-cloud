package com.nova.lyn.order.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName OrderDAO
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 3:45
 * @Version 1.0
 */
@Mapper
public interface OrderDAO {

    int addOrder(@Param("userId")String userId,
                 @Param("commodityCode")String commodityCode,
                 @Param("count")Integer count,
                 @Param("money")Integer money);
}
