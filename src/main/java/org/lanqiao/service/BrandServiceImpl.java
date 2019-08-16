package org.lanqiao.service;

import org.lanqiao.entity.Brand;
import org.lanqiao.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    BrandMapper brandMapper;

    @Override
    public Brand getBrand() {
        return brandMapper.selectByPrimaryKey(1);
    }
}
