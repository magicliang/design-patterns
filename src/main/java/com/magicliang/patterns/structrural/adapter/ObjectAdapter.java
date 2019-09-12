package com.magicliang.patterns.structrural.adapter;

/**
 * project name: design-patterns
 * <p>
 * description: 对象适配器
 *
 * @author magicliang
 * <p>
 * date: 2019-09-12 16:35
 */
public class ObjectAdapter implements ITarget {

    /**
     * 被适配类型
     */
    private Adaptee adaptee;

    /**
     * 普通请求
     *
     * @return 请求结果
     */
    @Override
    public Object request() {
        return adaptee.specialRequest();
    }

    /**
     * set the value of the adaptee
     *
     * @param adaptee the value of adaptee
     */
    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
