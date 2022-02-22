//package com.example.diff.testdemo;
//
//import com.alibaba.fastjson.JSON;
//
//import com.example.diff.utils.testutils.HttpClientUtils;
//import com.oracle.tools.packager.Log;
//
//import java.util.HashMap;
//
//import static com.example.diff.utils.testutils.HttpClientUtils.doPost;
//
//public class testdemo {
//    public static void main(String[] args) throws Exception {
//
//        String api= "/api/inster";
//        String url="http://localhost:8080"+api;
//        HashMap data= JSON.parseObject("{\"username\":\"帅锋test111\", \"password\":\"abc123456\"}",HashMap.class);
//
//        HashMap headers = JSON.parseObject("{\"token\":\"帅锋test111\"}", HashMap.class);
//        System.out.println(data);
//        System.out.println(url);
//        System.out.println(headers);
//
//
//        doPost(url,data);
//    }
//}
