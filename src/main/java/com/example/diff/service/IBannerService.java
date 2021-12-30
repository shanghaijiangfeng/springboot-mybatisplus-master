package com.example.diff.service;

import com.example.diff.domain.Banner;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shuaifeng
 * @since 2021-12-27
 */
public interface IBannerService extends IService<Banner> {
    List<Banner> list();



}
