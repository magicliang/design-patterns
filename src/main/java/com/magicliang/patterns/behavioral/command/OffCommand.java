package com.magicliang.patterns.behavioral.command;

/**
 * project name: design-patterns
 * <p>
 * description: 关机命令
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 19:04
 */
public class OffCommand extends AbstractCommand<Television> {

    /**
     * 空构造器
     */
    public OffCommand() {
        super();
    }

    /**
     * 构造器，不能由 lombok 生成：见 https://stackoverflow.com/questions/29740078/how-to-call-super-constructor-in-lombok Roel Spilker 的答案
     *
     * @param television 电视
     */
    public OffCommand(Television television) {
        super(television);
    }

    /**
     * 命令执行
     */
    @Override
    public void execute() {
        Television television = getReceiver();
        television.off();
    }

}
