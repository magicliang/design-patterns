package com.magicliang.patterns.gof.behavioral.strategy;

import org.testng.annotations.Test;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:24
 */
public class StrategyTest {

    @Test
    public void testStrategy() {
        Context context = new Context(new FirstStrategy());
        context.execute();

        context = new Context(new SecondStrategy());
        context.execute();
    }

}
