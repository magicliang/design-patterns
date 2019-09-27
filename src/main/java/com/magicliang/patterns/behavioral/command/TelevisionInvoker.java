package com.magicliang.patterns.behavioral.command;

import java.util.List;

/**
 * project name: design-patterns
 * <p>
 * description: 电视命令调用者
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 19:25
 */
public class TelevisionInvoker extends AbstractCommandInvoker<Television> {

    /**
     * 空构造器
     */
    public TelevisionInvoker() {
        super();
    }

    /**
     * 全参数构造器
     *
     * @param commands 命令列表
     */
    public TelevisionInvoker(List<Command<Television>> commands) {
        super(commands);
    }

}
