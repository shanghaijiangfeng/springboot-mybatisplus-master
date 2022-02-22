package com.example.diff.utils.testutils;


import com.alibaba.fastjson.JSON;
import com.example.diff.domain.Testcase;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service
public class runcase {
    public String run(Testcase testcase) throws Exception {


//        if (testcase.getMethond() == "post") {
//            if (testcase.getData()!=null){
                String api= testcase.getUrl();
                String url="http://localhost:8080"+api;
                String headers=testcase.getHeaders();
                HashMap header = JSON.parseObject(headers, HashMap.class);
                String datas=testcase.getData();


                return HttpUtils.postJson(url,null,header,datas);

//
//            }else if(testcase.getHeaders()!=null){
//
//            }


//        }
////        else if (testcase.getMethond() == "get")
////        {
////            return "1";
////
////        }
//
//
//
//        return null;
//    }
};}
