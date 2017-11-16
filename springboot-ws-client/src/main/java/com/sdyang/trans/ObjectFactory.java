
package com.sdyang.trans;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sdyang.trans package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sdyang.trans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLastMessageRequest }
     * 
     */
    public GetLastMessageRequest createGetLastMessageRequest() {
        return new GetLastMessageRequest();
    }

    /**
     * Create an instance of {@link InitTransResponse }
     * 
     */
    public InitTransResponse createInitTransResponse() {
        return new InitTransResponse();
    }

    /**
     * Create an instance of {@link QuerySyncTimeRequest }
     * 
     */
    public QuerySyncTimeRequest createQuerySyncTimeRequest() {
        return new QuerySyncTimeRequest();
    }

    /**
     * Create an instance of {@link InitTransRequest }
     * 
     */
    public InitTransRequest createInitTransRequest() {
        return new InitTransRequest();
    }

    /**
     * Create an instance of {@link WriteVehicleInfoResponse }
     * 
     */
    public WriteVehicleInfoResponse createWriteVehicleInfoResponse() {
        return new WriteVehicleInfoResponse();
    }

    /**
     * Create an instance of {@link GetLastMessageResponse }
     * 
     */
    public GetLastMessageResponse createGetLastMessageResponse() {
        return new GetLastMessageResponse();
    }

    /**
     * Create an instance of {@link WriteVehicleInfoRequest }
     * 
     */
    public WriteVehicleInfoRequest createWriteVehicleInfoRequest() {
        return new WriteVehicleInfoRequest();
    }

    /**
     * Create an instance of {@link QueryLimitSpeedRequest }
     * 
     */
    public QueryLimitSpeedRequest createQueryLimitSpeedRequest() {
        return new QueryLimitSpeedRequest();
    }

    /**
     * Create an instance of {@link QuerySyncTimeResponse }
     * 
     */
    public QuerySyncTimeResponse createQuerySyncTimeResponse() {
        return new QuerySyncTimeResponse();
    }

    /**
     * Create an instance of {@link QueryLimitSpeedResponse }
     * 
     */
    public QueryLimitSpeedResponse createQueryLimitSpeedResponse() {
        return new QueryLimitSpeedResponse();
    }

}
