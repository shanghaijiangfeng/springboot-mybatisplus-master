package com.example.diff.service;

import com.example.diff.domain.Account;
import com.example.diff.domain.Testcase;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shuaifeng
 * @since 2022-01-06
 */
public interface ITestcaseService extends IService<Testcase> {
    int savecase(Testcase testcase);

    Testcase querycase(Integer id);

}
