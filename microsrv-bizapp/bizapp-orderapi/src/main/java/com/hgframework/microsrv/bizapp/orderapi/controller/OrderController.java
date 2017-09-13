package com.hgframework.microsrv.bizapp.orderapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/13 0013.
 */
@RestController
public class OrderController {

    @RequestMapping(value = "/order/create", method = {RequestMethod.GET})
    public String create(@RequestParam(value = "orderType") String orderType) {
        return "create order succ";
    }
}
