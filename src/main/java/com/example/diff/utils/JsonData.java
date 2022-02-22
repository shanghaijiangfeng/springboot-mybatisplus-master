package com.example.diff.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //会生成一个包含所有变量
@NoArgsConstructor //生成一个无参数的构造方法
public class JsonData {
    /**
     * 状态码 0 表示成功，1表示处理中，-1表示失败
     */
    private Integer code;
    /**
     * 数据
     */
    private Object data;
    /**
     * 描述
     */
    private String msg;

    // 成功，传入数据
    public static JsonData buildSuccess() {
        return new JsonData(200, null, null);
    }

    // 成功，传入数据
    public static JsonData buildSuccess(Object data) {
        return new JsonData(200, data, null);
    }

    // 失败，传入描述信息
    public static JsonData buildError(String msg) {
        return new JsonData(-1, null, msg);
    }

    // 失败，传入描述信息,状态码
    public static JsonData buildError(String msg, Integer code) {
        return new JsonData(code, null, msg);
    }

}