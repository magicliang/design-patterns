package com.magicliang.patterns.gof.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 23:35
 */
@Slf4j
public class ObserverFirstImpl implements Observer {
    /**
     * 通过事件更新观察者
     *
     * @param event 事件
     */
    @Override
    public void update(Event event) {
        log.info("event is：" + event);
    }
}
