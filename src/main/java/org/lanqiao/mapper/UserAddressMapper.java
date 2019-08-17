package org.lanqiao.mapper;

import org.lanqiao.entity.UserAddress;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressMapper {
    int deleteByPrimaryKey(Integer useraddressId);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    UserAddress selectByPrimaryKey(Integer useraddressId);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);

    UserAddress getRecMsg(Integer useraddressId);
}