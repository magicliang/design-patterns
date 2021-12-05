package com.magicliang.patterns.gof.behavioral.mediator;

/**
 * project name: design-patterns
 * <p>
 * description: 协调者
 * 基础协调者接口
 *
 * @author magicliang
 * <p>
 * date: 2019-09-29 14:36
 */
public interface Mediator {

    /**
     * 像特定的成员发送消息
     *
     * @param id  成员 id
     * @param msg 消息
     */
    void operation(String id, String msg);

    /**
     * 注册特定的成员
     *
     * @param member 成员
     */
    void register(Member member);
}
