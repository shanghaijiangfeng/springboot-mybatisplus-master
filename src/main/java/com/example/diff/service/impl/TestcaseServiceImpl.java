package com.example.diff.service.impl;

import com.example.diff.domain.Testcase;
import com.example.diff.mapper.TestcaseMapper;
import com.example.diff.service.ITestcaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shuaifeng
 * @since 2022-01-06
 */
@Service
public class TestcaseServiceImpl extends ServiceImpl<TestcaseMapper, Testcase> implements ITestcaseService {

    @Autowired
    private TestcaseMapper testcaseMapper;

    @Override
    public int savecase(Testcase testcase) {
        return testcaseMapper.insert(testcase);
    }

    @Override
    public Testcase querycase(Integer id) {

        return testcaseMapper.selectById(id);
    }


}
