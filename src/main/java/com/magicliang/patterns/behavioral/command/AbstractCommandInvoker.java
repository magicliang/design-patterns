package com.magicliang.patterns.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * project name: design-patterns
 * <p>
 * description: 抽象命令调用者
 * 抽象类是抽象类型和方法的结合层
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 19:21
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AbstractCommandInvoker<Receiver> implements Invoker<Command<Receiver>> {

    /**
     * 命令列表
     */
    private List<Command<Receiver>> commands;

    /**
     * 执行全部命令
     */
    @Override
    public void executeAll() {
        getCommands().forEach((Command::execute));
    }
}
