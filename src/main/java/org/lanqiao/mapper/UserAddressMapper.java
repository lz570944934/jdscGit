package org.lanqiao.mapper;

import org.lanqiao.entity.UserAddress;

public interface UserAddressMapper {
    int deleteByPrimaryKey(Integer useraddressId);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    UserAddress selectByPrimaryKey(Integer useraddressId);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);
}