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
    private SystemImplA systemImplA;

    /**
     * B 系统实例
     */
    private SystemImplB systemImplB;

    /**
     * 空构造器
     */
    public FacadeImpl() {
        super();
    }

    /**
     * 构造器
     *
     * @param systemImplA A 系统实例
     * @param systemImplB B 系统实例
     */
    public FacadeImpl(SystemImplA systemImplA, SystemImplB systemImplB) {
        this.systemImplA = systemImplA;
        this.systemImplB = systemImplB;
    }

    /**
     * 包装过后的门面方法
     */
    @Override
    public void wrapOperation() {
        systemImplA.operation();
        systemImplB.operation();
    }

    /**
     * set the value of the systemA
     *
     * @param systemImplA the value of systemA
     */
    public void setSystemImplA(SystemImplA systemImplA) {
        this.systemImplA = systemImplA;
    }

    /**
     * set the value of the systemB
     *
     * @param systemImplB the value of systemB
     */
    public void setSystemImplB(SystemImplB systemImplB) {
        this.systemImplB = systemImplB;
    }
}
