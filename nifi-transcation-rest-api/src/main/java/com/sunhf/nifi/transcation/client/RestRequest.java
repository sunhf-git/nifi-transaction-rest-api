package com.sunhf.nifi.transcation.client;

import java.util.HashMap;
import java.util.Map;

public class RestRequest {

    private Map<String, Object> pathVirables = new HashMap<>();

    private Map<String, Object> parameters = new HashMap<>();

    private Map<String, Object> rawBody = new HashMap<>();

    private Object objectBody;

    private String url;

    public RestRequest() {
        this(null);
    }

    public RestRequest(String url) {
        this.url = url;
    }



}
