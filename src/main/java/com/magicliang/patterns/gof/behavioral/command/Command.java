package com.magicliang.patterns.gof.behavioral.command;

/**
 * project name: design-patterns
 * <p>
 * description: 命令
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 18:26
 */
public interface Command<Receiver> {

    /**
     * 命令执行
     */
    void execute();
}
