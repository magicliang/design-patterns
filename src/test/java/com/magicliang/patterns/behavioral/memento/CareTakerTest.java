package com.magicliang.patterns.behavioral.memento;

import org.testng.annotations.Test;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 19:30
 */
public class CareTakerTest {

    @Test
    public void testSaveAndRestoreState() {
        int count = 5;
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        for (int i = 1; i <= count; i++) {
            originator.setState(i + "");
            careTaker.saveState(originator);
        }

        for (int i = 0; i < count; i++) {
            careTaker.restoreState(originator);
        }
    }
}