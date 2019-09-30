package com.magicliang.patterns.behavioral.iterator;

/**
 * project name: design-patterns
 * <p>
 * description: 列表接口
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 10:43
 */
public interface List<T> extends Iterable<T> {

    /**
     * 增加列表元素
     *
     * @param e 元素
     */
    void add(T e);

    /**
     * 生成迭代器
     *
     * @return 迭代器
     */
    @Override
    Iterator<T> getIterator();
}
