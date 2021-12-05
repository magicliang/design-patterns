package com.magicliang.patterns.gof.structrural.bridge;

/**
 * project name: design-patterns
 * <p>
 * description: 抽象电脑
 *
 * @author magicliang
 * <p>
 * date: 2019-09-12 19:08
 */
public abstract class AbstractComputer {

    /**
     * 打印机组件
     */
    final private Printer printer;

    /**
     * 抽象计算方法，抽象层的可变化点
     *
     * @return 计算结果
     */
    public abstract int calculate();

    /**
     * 计算机打印，类似适配器模式但不是适配器模式
     */
    public void computerPrint() {
        printer.print();
    }

    /**
     * 构造函数
     *
     * @param printer 打印机
     */
    public AbstractComputer(Printer printer) {
        this.printer = printer;
    }
}
