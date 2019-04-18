package com.nova.lyn.accountservice.service.impl;

import com.nova.lyn.accountservice.dao.AccountDAO;
import com.nova.lyn.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/18 0018 上午 8:41
 * @Version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public int updateAccount(String userId, Integer money) {
        int updateFlag = accountDAO.updateAccount(userId, money);

        if (updateFlag < 1) {
            throw new RuntimeException("账户余额不足");
        }
        /**制造10%的失败异常*/
        if (new Random().nextInt(10) < 2) {
            throw new RuntimeException("未知错误，请稍后重试");
        }
        return updateFlag;
    }
}
