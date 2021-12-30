package com.example.diff.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.diff.domain.Account;

import java.util.List;

/**
 *
 */
public interface AccountService extends IService<Account> {
    List<Account> listuser();

    int saveuser(Account account);

    int updateuser(Account account);

    int deleteuser(Account account);
}
