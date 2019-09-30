package com.magicliang.patterns.behavioral.observer;

/**
 * project name: design-patterns
 * <p>
 * description: 观察者模式
 *
 * java 自带
 *  java.util.Observer and java.util.Observable 两个接口
 *
 *  不过自 java 9 以后就被废弃了
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 20:09
 */
public interface Observer {

    /**
     * 通过事件更新观察者
     *
     * @param event 事件
     */
    void update(Event event);
}
