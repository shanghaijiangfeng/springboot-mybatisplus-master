package com.example.diff.controller;


import com.example.diff.domain.Testcase;
import com.example.diff.service.ITestcaseService;
import com.example.diff.utils.JsonData;
import com.example.diff.utils.testutils.runcase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shuaifeng
 * @since 2022-01-06
 */
@RestController
@RequestMapping("testcase")
public class TestcaseController {
    @Autowired
    private ITestcaseService ITestcaseService;
    @Autowired
    private runcase runcase;
    //新增测试用例接口
    @PostMapping("insertcase")
    public JsonData insertcase(@RequestBody Testcase testcase){
        int s=ITestcaseService.savecase(testcase);
        return JsonData.buildSuccess(s);
    }
    @GetMapping("querycaseid/{id}")
    public JsonData querycaseid(@PathVariable("id") Integer id){
        Testcase testcases=ITestcaseService.querycase(id);
        return JsonData.buildSuccess(testcases);
    }
    @PostMapping("runcaseid")
    public JsonData runcase(@RequestBody Testcase testcase) throws Exception {
        Integer id=testcase.getTestcase();
        Testcase testcaseent =ITestcaseService.querycase(id);
        return JsonData.buildSuccess(runcase.run(testcaseent));
    }
////    批量查询case
//    @GetMapping ("querylistcase")
//    public JsonData querylistcase(@RequestParam String groupId) throws Exception {
//        Integer id= Integer.valueOf(groupId);
//        List<Testcase> testcases =ITestcaseService.listByMap("groupid",id);
//        return JsonData.buildSuccess(testcases);
//    }
}
