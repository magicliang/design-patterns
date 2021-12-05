package com.magicliang.patterns.gof.behavioral.iterator;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-29 20:02
 */
public interface Iterator<I> {

    /**
     * 是否还有下一个元素
     *
     * @return 是否还有下一个元素
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return 下一个元素
     */
    I next();
}
