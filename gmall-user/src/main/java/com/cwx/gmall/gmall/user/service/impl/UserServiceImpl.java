package com.cwx.gmall.gmall.user.service.impl;


import com.cwx.gmall.gmall.user.bean.UmsMember;
import com.cwx.gmall.gmall.user.bean.UmsMemberReceiveAddress;
import com.cwx.gmall.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.cwx.gmall.gmall.user.mapper.UserMapper;
import com.cwx.gmall.gmall.user.service.UserService;
import com.sun.deploy.panel.IProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @auther shanhen
 * @create 2020-05-15 17:00
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAll();//userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

//        Example e = new Example(UmsMemberReceiveAddress.class);
//
//        e.createCriteria().andEqualTo("memberId",memberId);

        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}
