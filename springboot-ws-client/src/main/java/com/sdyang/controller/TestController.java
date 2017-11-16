package com.sdyang.controller;

import com.SpringBootStart;
import com.sdyang.WsClient;
import com.sdyang.trans.WriteVehicleInfoResponse;
import com.sdyang.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sdyang
 * @create 2017-11-16 15:27
 **/
@Controller
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private WsClient wsClient;

    @RequestMapping("test")
    @ResponseBody
    public Object test() {

        WriteVehicleInfoResponse response = wsClient.writeVehicleInfo("hello");

        logger.info("收到响应消息："+JsonUtil.toJSONString(response));

        return "success";
    }
}
