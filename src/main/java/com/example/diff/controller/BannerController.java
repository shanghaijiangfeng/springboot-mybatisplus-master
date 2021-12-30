package com.example.diff.controller;


import com.example.diff.domain.Account;
import com.example.diff.domain.Banner;
import com.example.diff.service.IBannerService;
import com.example.diff.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shuaifeng
 * @since 2021-12-27
 */
@RestController
@RequestMapping("/banner1/banner")
public class BannerController {

    @Autowired
    private IBannerService iBannerService;
//    查询
    @GetMapping("list_user")
    public JsonData user(){
        List<Banner> list=iBannerService.list();
        return JsonData.buildSuccess(list);
    };

}
