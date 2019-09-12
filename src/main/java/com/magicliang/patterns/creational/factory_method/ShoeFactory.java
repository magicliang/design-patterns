package com.magicliang.patterns.creational.factory_method;

import com.magicliang.patterns.model.Shoe;

/**
 * project name: design-patterns
 * <p>
 * description: 鞋子工厂
 *
 * @author magicliang
 * date: 2019-09-10 17:33
 */
public class ShoeFactory implements AbstractFactory<Shoe> {
    /**
     * 生产产品
     *
     * @return 产品
     */
    @Override
    public Shoe produce() {
        return new Shoe();
    }
}
