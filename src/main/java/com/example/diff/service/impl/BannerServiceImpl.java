package com.example.diff.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.diff.domain.Banner;
import com.example.diff.mapper.BannerMapper;
import com.example.diff.service.IBannerService;
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
 * @since 2021-12-27
 */
@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, Banner> implements IBannerService {

    @Autowired
    private BannerMapper bannerMapper;
    @Override
    public List<Banner> list() {

        List<Banner> list= bannerMapper.selectList(new QueryWrapper<>());
        return list;
    }

}
