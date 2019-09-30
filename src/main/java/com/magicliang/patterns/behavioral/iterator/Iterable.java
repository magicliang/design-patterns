package com.magicliang.patterns.behavioral.iterator;

/**
 * project name: design-patterns
 * <p>
 * description:
 * <p>
 * 可迭代类型
 * 这里的泛型元素不是迭代器，而是"根元素"
 *
 * @author magicliang
 * <p>
 * date: 2019-09-29 20:02
 */
public interface Iterable<T> {

    /**
     * 生成迭代器
     *
     * @return 迭代器
     */
    Iterator<T> getIterator();
}
