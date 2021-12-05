package com.magicliang.patterns.gof.behavioral.observer;

import org.testng.annotations.Test;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 23:58
 */
public class SubjectTest {

    @Test
    public void testNotifyObservers() {
        Observer observer = new ObserverFirstImpl();

        Subject subject = new SubjectImpl();
        subject.register(observer);
        subject.notifyObservers();
        subject.unRegister(observer);
    }
}
