package com.cwx.gmall.gmall.user.mapper;

import com.cwx.gmall.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @auther shanhen
 * @create 2020-05-15 17:01
 */
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
