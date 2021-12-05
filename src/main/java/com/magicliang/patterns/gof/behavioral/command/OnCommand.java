package com.magicliang.patterns.gof.behavioral.command;

/**
 * project name: design-patterns
 * <p>
 * description: 开机命令
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 18:54
 */
public class OnCommand extends AbstractCommand<Television> {

    /**
     * 空构造器
     */
    public OnCommand() {
        super();
    }

    /**
     * 构造器，不能由 lombok 生成：见 https://stackoverflow.com/questions/29740078/how-to-call-super-constructor-in-lombok Roel Spilker 的答案
     *
     * @param television 电视
     */
    public OnCommand(Television television) {
        super(television);
    }

    /**
     * 命令执行
     */
    @Override
    public void execute() {
        Television television = getReceiver();
        television.on();
    }
}
