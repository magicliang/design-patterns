package com.magicliang.patterns.structrural.adapter;

/**
 * project name: design-patterns
 * <p>
 * description: 目标接口
 *
 * @author magicliang
 * <p>
 * date: 2019-09-12 16:33
 */
public interface ITarget {
    /**
     * 普通请求
     *
     * @return 请求结果
     */
    Object request();
}
