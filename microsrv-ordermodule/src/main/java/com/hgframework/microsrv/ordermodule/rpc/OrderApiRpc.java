package com.hgframework.microsrv.ordermodule.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@FeignClient(name = "com.hgframework.orderapi", fallback = OrderApiRpc.OrderApiRpcHystrix.class)
public interface OrderApiRpc {

    @RequestMapping(value = "/order/create", method = {RequestMethod.GET})
    String create(@RequestParam(value = "orderType") String orderType);

    @Service
    class OrderApiRpcHystrix implements OrderApiRpc {
        @Override
        public String create(String orderType) {
            return "order create fail !!!!";
        }
    }
}
