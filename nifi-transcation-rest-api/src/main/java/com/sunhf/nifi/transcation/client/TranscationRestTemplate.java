package com.sunhf.nifi.transcation.client;

public class TranscationRestTemplate extends RestTemplate {

    @Override
    public <T> T getForRequest(RestRequest request) {

        return super.getForRequest(request);
    }

    @Override
    public <T> T postForRequest(RestRequest request) {
        return super.postForRequest(request);
    }

    @Override
    public <T> T deleteForRequest(RestRequest request) {
        return super.deleteForRequest(request);
    }
}
