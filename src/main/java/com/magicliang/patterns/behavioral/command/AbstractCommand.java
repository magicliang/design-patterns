package com.magicliang.patterns.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * project name: design-patterns
 * <p>
 * description: 抽象命令类型
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 18:55
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractCommand<Receiver> implements Command<Receiver> {

    /**
     * 命令接收者
     */
    private Receiver receiver;

    /**
     * 命令执行
     */
    @Override
    public abstract void execute();
}
