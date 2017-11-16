package com.sdyang.trans;

import com.sdyang.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * 浏览器访问：http://localhost:9080/ws/trans.wsdl
 *
 * @author sdyang
 * @create 2017-11-15 15:19
 **/
@Endpoint
public class TransEndpoint {

    private static Logger logger = LoggerFactory.getLogger(TransEndpoint.class);

    private static final String NAMESPACE_URI = "http://webservice.tfc.tmri.com";
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "WriteVehicleInfoRequest")
    @ResponsePayload
        public WriteVehicleInfoResponse writeVehicleInfo(@RequestPayload WriteVehicleInfoRequest request) {

       logger.info("接收到请求："+ JsonUtil.toJSONString(request));

        WriteVehicleInfoResponse response = new WriteVehicleInfoResponse();
        response.setWriteVehicleInfoReturn(0);
        return response;
    }
}
