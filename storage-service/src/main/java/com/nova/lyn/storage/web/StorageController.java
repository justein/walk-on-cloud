package com.nova.lyn.storage.web;

import com.nova.lyn.storage.dto.StorageDTO;
import com.nova.lyn.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName StorageController
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 2:32
 * @Version 1.0
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @RequestMapping(value = "/updateStorage", method = RequestMethod.POST)
    public ResponseEntity<?> updateStorage(@RequestBody StorageDTO storageDTO) {
        Assert.notNull(storageDTO);
        int updateRet = storageService.updateStorage(storageDTO);
        if (updateRet < 1) return ResponseEntity.ok("发生未知错误，请稍后重试");
        return ResponseEntity.ok("库存更新成功");
    }
}
