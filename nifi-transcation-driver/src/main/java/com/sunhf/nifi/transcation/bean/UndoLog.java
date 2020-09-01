package com.sunhf.nifi.transcation.bean;

/**
 * 用于操作回滚的日志
 */
public class UndoLog {

    /**
     * 事务id,在事务启动时生成
     */
    private String trxId;

    /**
     * 事件类型 如：CURD
     */
    private String eventType;

    /**
     * 事务回滚命令
     */
    private UndoCommand undoCommand;

    /**
     * 事务执行命令日志
     */
    private LogCommand logCommand;

}
