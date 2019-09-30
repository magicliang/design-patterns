package com.magicliang.patterns.behavioral.iterator;

/**
 * project name: design-patterns
 * <p>
 * description:
 * <p>
 * 可迭代类型
 *
 * @author magicliang
 * <p>
 * date: 2019-09-29 20:02
 */
public interface Iterable<T> {

    /**
     * 生成迭代器
     *
     * @return
     */
    Iterator<T> getIterator();
}
