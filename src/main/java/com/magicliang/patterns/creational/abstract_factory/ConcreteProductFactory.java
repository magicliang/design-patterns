package com.magicliang.patterns.creational.abstract_factory;

import com.magicliang.patterns.model.Coke;
import com.magicliang.patterns.model.Shoe;

/**
 * project name: design-patterns
 * <p>
 * description: 具体工厂
 *
 * @author magicliang
 * date: 2019-09-12 15:05
 */
public class ConcreteProductFactory implements AbstractProductFactory {
    /**
     * 生产可乐
     *
     * @return 可乐
     */
    @Override
    public Coke createCoke() {
        return new Coke();
    }

    /**
     * 生产鞋子
     *
     * @return 鞋子
     */
    @Override
    public Shoe createShoe() {
        return new Shoe();
    }
}
