package com.magicliang.patterns.gof.behavioral.strategy;

/**
 * project name: design-patterns
 * <p>
 * description: 首要策略
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:22
 */
public class FirstStrategy implements Strategy {

    @Override
    public void execute() {
        System.out.println("Called FirstStrategy.execute()");
    }
}

