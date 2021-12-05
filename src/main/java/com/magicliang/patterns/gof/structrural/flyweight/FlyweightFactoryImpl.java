package com.magicliang.patterns.gof.structrural.flyweight;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * project name: design-patterns
 * <p>
 * description: 享元工厂
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 16:22
 */
public class FlyweightFactoryImpl implements FlyweightFactory {

    /**
     * 饿汉模式，基础的享元池
     */
    private static final Map<Integer, Flyweight> FLYWEIGHTS = Maps.newHashMap();

    /**
     * 获取享元
     *
     * @param intrinsicState 内生状态
     * @return 享元
     */
    @Override
    public Flyweight getFlyweight(Integer intrinsicState) {

        if (null == intrinsicState) {
            return null;
        }

        Flyweight flyweight = FLYWEIGHTS.get(intrinsicState);
        if (null == flyweight) {
            flyweight = new Flyweight(intrinsicState);
            FLYWEIGHTS.put(intrinsicState, flyweight);
        }
        return flyweight;
    }
}
