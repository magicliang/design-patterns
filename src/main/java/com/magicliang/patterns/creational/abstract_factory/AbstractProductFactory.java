package com.magicliang.patterns.creational.abstract_factory;

import com.magicliang.model.Coke;
import com.magicliang.model.Shoe;

/**
 * project name: design-patterns
 * <p>
 * description: 抽象工厂接口
 *
 * @author magicliang
 * date: 2019-09-12 15:00
 */
public interface AbstractProductFactory {

    /**
     * 生产可乐
     *
     * @return 可乐
     */
    Coke createCoke();

    /**
     * 生产鞋子
     *
     * @return 鞋子
     */
    Shoe createShoe();

}
