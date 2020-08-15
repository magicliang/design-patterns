package com.magicliang.patterns.behavioral.strategy;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:24
 */
public class StrategyExample {

    public static void main(String[] args) {
        Context context = new Context(new FirstStrategy());
        context.execute();

        context = new Context(new SecondStrategy());
        context.execute();
    }

}
