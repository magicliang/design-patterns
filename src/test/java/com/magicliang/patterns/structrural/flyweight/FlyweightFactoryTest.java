package com.magicliang.patterns.structrural.flyweight;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 19:59
 */
public class FlyweightFactoryTest {

    @Test
    public void testGetFlyweight() {
        FlyweightFactory flyweightFactory = new FlyweightFactoryImpl();
        Integer intrinsicState = 1000;
        Flyweight flyweight = flyweightFactory.getFlyweight(intrinsicState);
        assertEquals(intrinsicState, flyweight.getIntrisicState());
    }
}