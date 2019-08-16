package org.lanqiao.mapper;

import org.lanqiao.entity.UserAddress;
import org.lanqiao.service.ReseveMsgService;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserAddressMapper {
    int deleteByPrimaryKey(Integer useraddressId);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    UserAddress selectByPrimaryKey(Integer useraddressId);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);

    UserAddress getReseveMsg(Integer useraddressId);
}