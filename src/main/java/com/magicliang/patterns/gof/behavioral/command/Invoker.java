package com.magicliang.patterns.gof.behavioral.command;

/**
 * project name: design-patterns
 * <p>
 * description: 命令调用者
 * 接口是基础的方法定义层
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 19:09
 */
public interface Invoker<C> {

    /**
     * 执行全部命令
     */
    void executeAll();
}
