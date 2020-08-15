package com.magicliang.patterns.behavioral.strategy;

/**
 * project name: design-patterns
 * <p>
 * description: 上下文
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:21
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行方法
     */
    public void execute() {
        this.strategy.execute();
    }
}
