package com.magicliang.patterns.gof.creational.factory_method;

import com.magicliang.model.Coke;

/**
 * project name: design-patterns
 * <p>
 * description: 可乐工厂
 *
 * @author magicliang
 * date: 2019-09-10 17:32
 */
public class CokeFactory implements AbstractFactory<Coke> {
    /**
     * 生产产品
     *
     * @return 产品
     */
    @Override
    public Coke produce() {
        return new com.magicliang.model.Coke();
    }
}
