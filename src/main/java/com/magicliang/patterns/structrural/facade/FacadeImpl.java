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
    private AsystemImpl aSystemImpl;

    /**
     * B 系统实例
     */
    private BsystemImpl bSystemImpl;

    /**
     * 空构造器
     */
    public FacadeImpl() {
        super();
    }

    /**
     * 构造器
     *
     * @param aSystemImpl A 系统实例
     * @param bSystemImpl B 系统实例
     */
    public FacadeImpl(AsystemImpl aSystemImpl, BsystemImpl bSystemImpl) {
        this.aSystemImpl = aSystemImpl;
        this.bSystemImpl = bSystemImpl;
    }

    /**
     * 包装过后的门面方法
     */
    @Override
    public void wrapOperation() {
        aSystemImpl.operation();
        bSystemImpl.operation();
    }

    /**
     * set the value of the systemA
     *
     * @param aSystemImpl the value of systemA
     */
    public void setaSystemImpl(AsystemImpl aSystemImpl) {
        this.aSystemImpl = aSystemImpl;
    }

    /**
     * set the value of the systemB
     *
     * @param bSystemImpl the value of systemB
     */
    public void setbSystemImpl(BsystemImpl bSystemImpl) {
        this.bSystemImpl = bSystemImpl;
    }
}
