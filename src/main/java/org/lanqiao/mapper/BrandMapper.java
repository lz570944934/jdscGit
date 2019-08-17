package org.lanqiao.mapper;

import org.lanqiao.entity.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);

    Brand getBrand(Integer brandId);
}