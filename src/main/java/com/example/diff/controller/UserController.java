package com.example.diff.controller;

import com.example.diff.domain.Account;
import com.example.diff.mapper.AccountMapper;
import com.example.diff.service.AccountService;
import com.example.diff.service.impl.AccountServiceImpl;
import com.example.diff.utils.JsonData;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private AccountService accountService;


//查询用户列表
    @GetMapping("list_user")
    public JsonData user(){
        List<Account> list=accountService.listuser();
        return JsonData.buildSuccess(list);
    };
//    新增用户
    @PostMapping("inster")
    public JsonData insteruser(@RequestBody Account account){
        int s=accountService.saveuser(account);
        return JsonData.buildSuccess(s);
    }
//    更新用户
    @PutMapping("updateuser")
    public JsonData updateuser(@RequestBody Account account){
        int upuser=accountService.updateuser(account);
        return JsonData.buildSuccess(upuser);
    }
//    删除用户
    @DeleteMapping("delete")
    public JsonData deleteuser(@RequestBody Account account){
        int delete=accountService.deleteuser(account);
        return JsonData.buildSuccess(delete);
    }

}
