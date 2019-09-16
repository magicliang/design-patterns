package com.magicliang.patterns.structrural.facade;

/**
 * project name: design-patterns
 * <p>
 * description: 具体门面
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 16:00
 */
public class FacadeImpl implements Facade {

    /**
     *
     */
    private SystemA systemA;

    /**
     * B 系统实例
     */
    private SystemB systemB;

    /**
     * 空构造器
     */
    public FacadeImpl() {
        super();
    }

    /**
     * 构造器
     *
     * @param systemA A 系统实例
     * @param systemB B 系统实例
     */
    public FacadeImpl(SystemA systemA, SystemB systemB) {
        this.systemA = systemA;
        this.systemB = systemB;
    }

    /**
     * 包装过后的门面方法
     */
    @Override
    public void wrapOperation() {
        systemA.operation();
        systemB.operation();
    }

    /**
     * set the value of the systemA
     *
     * @param systemA the value of systemA
     */
    public void setSystemA(SystemA systemA) {
        this.systemA = systemA;
    }

    /**
     * set the value of the systemB
     *
     * @param systemB the value of systemB
     */
    public void setSystemB(SystemB systemB) {
        this.systemB = systemB;
    }
}
