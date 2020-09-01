package com.sunhf.nifi.transcation.api;

/**
 * nifi 各rest api 资源路径
 */
public interface NifiResources {

    interface ProcessGroups {
        String REPLACE_REQUEST = "/process-groups/replace-requests/{id}";

    }
}
