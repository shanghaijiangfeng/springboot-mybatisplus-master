package com.example.diff.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.diff.domain.Account;
import com.example.diff.mapper.AccountMapper;
import com.example.diff.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
    implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> listuser() {
        return accountMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public int saveuser(Account account) {
        return accountMapper.insert(account);
    }

    @Override
    public int updateuser(Account account) {
        QueryWrapper<Account> queryWrapper=new QueryWrapper<>();
        String username=account.getUsername();

        return accountMapper.update(account,queryWrapper.eq("username",username));
    }

    @Override
    public int deleteuser(Account account) {
        Map<String, Object> map=new HashMap<>();
        int accountId= Math.toIntExact(account.getAccountId());
        map.put("account_Id",accountId);

        return accountMapper.deleteByMap(map);
    }
}




