package com.sdyang;

import com.sdyang.trans.WriteVehicleInfoRequest;
import com.sdyang.trans.WriteVehicleInfoResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * @author sdyang
 * @create 2017-11-16 9:16
 **/
public class WsClient extends WebServiceGatewaySupport {
    public WriteVehicleInfoResponse writeVehicleInfo(String name) {
        WriteVehicleInfoRequest request = new WriteVehicleInfoRequest();

        request.setCdh("测试");
        request.setCllx("20171116");
        request.setClpp("ws");

        WriteVehicleInfoResponse response = (WriteVehicleInfoResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://localhost:9080/ws/trans.wsdl", request);
        return response;
    }
}
