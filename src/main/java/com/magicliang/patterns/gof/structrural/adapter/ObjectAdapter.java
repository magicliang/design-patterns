package com.magicliang.patterns.gof.structrural.adapter;

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
    private Adapted adapted;

    /**
     * 普通请求
     *
     * @return 请求结果
     */
    @Override
    public Object request() {
        return adapted.specialRequest();
    }

    /**
     * set the value of the adaptee
     *
     * @param adapted the value of adaptee
     */
    public void setAdapted(Adapted adapted) {
        this.adapted = adapted;
    }
}
