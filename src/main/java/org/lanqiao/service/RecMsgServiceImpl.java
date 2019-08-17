package org.lanqiao.service;

import org.lanqiao.entity.UserAddress;
import org.lanqiao.mapper.UserAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecMsgServiceImpl implements RecMsgService{

    @Autowired
    UserAddressMapper userAddressMapper;

    @Override
    public UserAddress getRecMsg() {
        return userAddressMapper.getRecMsg(1);
    }
}
