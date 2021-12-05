package com.magicliang.patterns.gof.behavioral.mediator;

/**
 * project name: design-patterns
 * <p>
 * description: 基础的同事接口
 *
 * @author magicliang
 * <p>
 * date: 2019-09-29 14:40
 */
public interface Member {

    /**
     * 获取成员id
     *
     * @return id
     */
    String getId();

    /**
     * 引用协调者
     *
     * @param mediator 协调者
     */
    void setMediator(Mediator mediator);

    /**
     * 接收消息
     *
     * @param msg 消息
     */
    void receiveMsg(String msg);
}
