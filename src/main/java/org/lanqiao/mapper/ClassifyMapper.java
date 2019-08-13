package org.lanqiao.mapper;

import org.lanqiao.entity.Classify;

public interface ClassifyMapper {
    int deleteByPrimaryKey(Integer classifyId);

    int insert(Classify record);

    int insertSelective(Classify record);

    Classify selectByPrimaryKey(Integer classifyId);

    int updateByPrimaryKeySelective(Classify record);

    int updateByPrimaryKey(Classify record);
}