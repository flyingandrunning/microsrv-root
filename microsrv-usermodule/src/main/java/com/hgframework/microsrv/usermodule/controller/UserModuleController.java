package com.hgframework.microsrv.usermodule.controller;

import com.hgframework.microsrv.usermodule.rpc.UserApiRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@RestController
public class UserModuleController {

    @Autowired
    private UserApiRpc userApiRpc;

    @RequestMapping(value = "/user/create")
    public String handlerCreate(@RequestParam(value = "username") String username, @RequestParam(value = "userpwd") String userpwd) {
        return "create succ ok " + this.userApiRpc.createUser(username, userpwd) + System.currentTimeMillis();
    }
}
