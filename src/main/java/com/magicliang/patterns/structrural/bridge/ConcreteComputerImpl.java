package com.magicliang.patterns.structrural.bridge;

/**
 * project name: design-patterns
 * <p>
 * description: 具体计算机
 *
 * @author magicliang
 * <p>
 * date: 2019-09-12 19:13
 */
public class ConcreteComputerImpl extends AbstractComputer {

    /**
     * 构造函数
     *
     * @param printer 打印机
     */
    public ConcreteComputerImpl(Printer printer) {
        super(printer);
    }

    /**
     * 抽象计算方法，抽象层的可变化点
     */
    @Override
    public int calculate() {
        computerPrint();
        return 1;
    }
}
