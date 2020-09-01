package com.sunhf.nifi.transcation.client;

import com.sunhf.nifi.transcation.driver.TranscationDriver;

/**
 * 调用nifi的rest api
 */
public class RestTemplate {

    TranscationDriver transcationDriver;


    public <T> T getForRequest(RestRequest request) {
        return null;
    }

    public <T> T postForRequest(RestRequest request) {
        return null;
    }

    public <T> T deleteForRequest(RestRequest request) {
        return null;
    }

}
