package com.nova.lyn.order.service;

import com.nova.lyn.order.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName AccountService
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 4:41
 * @Version 1.0
 */
@FeignClient(name = "accout", url = "http://localhost:11180/account/updateAccount")
public interface AccountService {

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity updateAccount(AccountDTO accountDTO);
}
