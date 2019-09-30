package com.magicliang.patterns.behavioral.observer;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Predicate;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 23:48
 */
public class SubjectImpl implements Subject {

    /**
     * 观察者列表
     */
    private List<Observer> observers = Lists.newArrayList();

    /**
     * 注册观察者
     *
     * @param observer 观察者
     */
    @Override
    public void register(Observer observer) {
        // 避免重复注册和内存泄漏
        if (null == observer || observers.contains(observer)) {
            return;
        }
        observers.add(observer);
    }

    /**
     * 解注册
     *
     * @param observer 观察者
     */
    @Override
    public void unRegister(Observer observer) {
        if (!observers.contains(observer)) {
            return;
        }
        observers.removeIf(Predicate.isEqual(observer));
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        Event event = new StringEvent("foo");

        observers.forEach((ob) -> ob.update(event));
    }
}
