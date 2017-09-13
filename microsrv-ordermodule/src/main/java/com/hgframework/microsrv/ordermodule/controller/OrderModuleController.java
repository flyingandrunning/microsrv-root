package com.hgframework.microsrv.ordermodule.controller;

import com.hgframework.microsrv.ordermodule.rpc.OrderApiRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@RestController
public class OrderModuleController {

    @Autowired
    private OrderApiRpc orderApiRpc;

    @RequestMapping(value = "/order/create")
    public String handlerCreate(@RequestParam(value = "orderType") String orderType) {
        return "create succ ok" + this.orderApiRpc.create(orderType) + System.currentTimeMillis();
    }
}
