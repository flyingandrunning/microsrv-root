package com.hgframework.microsrv.usermodule.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@FeignClient(name = "com.hgframework.userapi", fallback = UserApiRpc.UserApiRpcHystrix.class)
public interface UserApiRpc {

    /**
     * 这里只能这次post、get、put等其中之一，否则会报错，有可能是spring cloud本身的限制
     *
     * @param username
     * @param userpwd
     * @return
     */
    @RequestMapping(value = "/user/create", method = {RequestMethod.GET})
    String createUser(@RequestParam(value = "username") String username, @RequestParam(value = "userpwd") String userpwd);

    @Service
    class UserApiRpcHystrix implements UserApiRpc {
        @Override
        public String createUser(String username, String userPwd) {
            return "error !!! ";
        }
    }
}
