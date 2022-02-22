package com.example.diff.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author shuaifeng
 * @since 2022-01-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Testcase implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "testcase", type = IdType.AUTO)
    private Integer testcase;

    private String methond;

    private String url;

    private String headers;

    private String data;

    private String code;

    private String groupId;

    private String sequence;


}
