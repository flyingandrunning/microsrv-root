package com.hgframework.microsrv.bizapp.userapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/13 0013.
 */
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/user/create", method = {RequestMethod.GET})
    public String createUser(@RequestParam(value = "username") String username, @RequestParam(value = "userpwd") String userpwd) {
        logger.info("request user create");
        StringBuffer sb = new StringBuffer().append(username).append(":").append(userpwd);
        return sb.toString();

    }
}
