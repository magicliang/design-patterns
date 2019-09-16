package com.magicliang.patterns.structrural.flyweight;

/**
 * project name: design-patterns
 * <p>
 * description: 享元工厂接口
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 19:56
 */
public interface FlyweightFactory {

    /**
     * 获取享元
     *
     * @param intrinsicState 内生状态
     * @return 享元
     */
    Flyweight getFlyweight(Integer intrinsicState);
}
