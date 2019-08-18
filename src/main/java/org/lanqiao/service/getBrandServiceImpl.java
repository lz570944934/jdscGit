package org.lanqiao.service;

import org.lanqiao.entity.Brand;
import org.lanqiao.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class getBrandServiceImpl implements getBrandService{
    @Autowired
    BrandMapper brandMapper;

    @Override
    public Brand getBrand() {
        return brandMapper.getBrand(1);
    }
}
