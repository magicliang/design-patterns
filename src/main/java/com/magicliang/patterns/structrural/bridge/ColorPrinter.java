package com.magicliang.patterns.structrural.bridge;

/**
 * project name: design-patterns
 * <p>
 * description: 彩色打印机
 *
 * @author magicliang
 * <p>
 * date: 2019-09-12 19:12
 */
public class ColorPrinter implements Printer {
    /**
     * 打印方法，具体实现层的变化点
     */
    @Override
    public void print() {
        System.out.println("ColorPrinter");
    }
}
