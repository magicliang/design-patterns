package com.magicliang.patterns.gof.structrural.bridge;

/**
 * project name: design-patterns
 * <p>
 * description: 抽象打印机接口
 *
 * @author magicliang
 * <p>
 * date: 2019-09-12 19:09
 */
public interface Printer {

    /**
     * 打印方法，具体实现层的变化点
     */
    void print();
}
