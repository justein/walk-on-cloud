package com.nova.lyn.accountservice.web;

import com.nova.lyn.accountservice.dto.AccountDTO;
import com.nova.lyn.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AccountController
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/18 0018 上午 8:54
 * @Version 1.0
 */
@RestController("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/updateAccount")
    public ResponseEntity<?> updateAccount(@RequestBody AccountDTO accountDTO) {

        int updateRet = accountService.updateAccount(accountDTO.getUserId(), accountDTO.getMoney());
        if (updateRet < 1) {
            return ResponseEntity.ok("发生未知错误，请稍后重试");
        }
        return ResponseEntity.ok("扣款成功");

    }
}
