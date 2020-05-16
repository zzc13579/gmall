package com.cwx.gmall.gmall.user.controller;

import com.cwx.gmall.gmall.user.bean.UmsMember;
import com.cwx.gmall.gmall.user.bean.UmsMemberReceiveAddress;
import com.cwx.gmall.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @auther shanhen
 * @create 2020-05-15 16:59
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMember = userService.getAllUser();

        return umsMember;
    }
    @RequestMapping("getReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = userService.getReceiveAddressByMemberId(memberId);

        return umsMemberReceiveAddress;
    }

}
