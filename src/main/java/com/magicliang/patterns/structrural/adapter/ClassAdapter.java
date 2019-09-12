package com.magicliang.patterns.structrural.adapter;

/**
 * project name: design-patterns
 * <p>
 * description: 类适配器
 *
 * @author magicliang
 * <p>
 * date: 2019-09-12 16:37
 */
public class ClassAdapter extends Adaptee implements ITarget {
    /**
     * 普通请求
     *
     * @return 请求结果
     */
    @Override
    public Object request() {
        return specialRequest();
    }
}
