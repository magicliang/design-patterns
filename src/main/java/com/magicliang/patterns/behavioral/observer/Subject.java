package com.magicliang.patterns.behavioral.observer;

/**
 * project name: design-patterns
 * <p>
 * description: 主题，类似 topic
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 23:03
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * @param observer 观察者
     */
    void register(Observer observer);

    /**
     * 解注册
     *
     * @param observer 观察者
     */
    void unRegister(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
