package com.sunhf.nifi.transcation.driver;

/**
 *  nifi rest-api 事务处理器
 */
public interface TranscationDriver {


    void addStep();

    void commit();

    void rollback();

    void errorHandle(Exception e);
}
