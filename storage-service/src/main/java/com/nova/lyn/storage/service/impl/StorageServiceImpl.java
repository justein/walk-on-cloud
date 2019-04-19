package com.nova.lyn.storage.service.impl;

import com.nova.lyn.storage.dao.StorageDAO;
import com.nova.lyn.storage.dto.StorageDTO;
import com.nova.lyn.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName StorageServiceImpl
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 2:11
 * @Version 1.0
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDAO storageDAO;

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public int updateStorage(StorageDTO storageDTO) {
        int updateFlag = storageDAO.updateStorage(storageDTO.getCommodityCode(), storageDTO.getCounter());
        if (updateFlag < 1) {
            throw new RuntimeException("库存不足");
        }
        return updateFlag;
    }
}
