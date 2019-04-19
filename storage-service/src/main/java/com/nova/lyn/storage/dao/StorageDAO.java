package com.nova.lyn.storage.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName StorageDAO
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 2:21
 * @Version 1.0
 */
@Mapper
public interface StorageDAO {

    int updateStorage(@Param("commodity_code") String commodityCode, @Param("count")Integer count);
}
