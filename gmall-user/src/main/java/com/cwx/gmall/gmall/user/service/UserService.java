package com.cwx.gmall.gmall.user.service;

import com.cwx.gmall.gmall.user.bean.UmsMember;
import com.cwx.gmall.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @auther shanhen
 * @create 2020-05-15 17:05
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
