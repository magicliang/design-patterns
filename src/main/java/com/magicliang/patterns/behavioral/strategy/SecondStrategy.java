package com.magicliang.patterns.behavioral.strategy;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:23
 */
public class SecondStrategy implements Strategy {

    @Override
    public void execute() {
        System.out.println("Called SecondStrategy.execute()");
    }
}