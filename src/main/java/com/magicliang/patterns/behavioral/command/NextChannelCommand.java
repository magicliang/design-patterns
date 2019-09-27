package com.magicliang.patterns.behavioral.command;

/**
 * project name: design-patterns
 * <p>
 * description: 换台命令
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 19:05
 */
public class NextChannelCommand extends AbstractCommand<Television> {

    /**
     * 空构造器
     */
    public NextChannelCommand() {
        super();
    }

    /**
     * 构造器，不能由 lombok 生成：见 https://stackoverflow.com/questions/29740078/how-to-call-super-constructor-in-lombok Roel Spilker 的答案
     *
     * @param television 电视
     */
    public NextChannelCommand(Television television) {
        super(television);
    }

    /**
     * 命令执行
     */
    @Override
    public void execute() {
        Television television = getReceiver();
        television.nextChannel();
    }

}
