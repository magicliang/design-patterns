package com.magicliang.patterns.creational.factory_method;

import com.magicliang.patterns.model.Product;

/**
 * project name: design-patterns
 * <p>
 * description: 工厂方法模式，使用泛型
 *
 * @author magicliang
 * @date 2019-09-09 22:44
 */
public class FactoryMethodPattern {

    /**
     * 可乐工厂
     */
    private volatile CokeFactory cokeFactory;

    /**
     * 鞋子工厂
     */
    private volatile ShoeFactory shoeFactory;

    /**
     * 生产可乐
     *
     * @return 可乐
     */
    public Product produceCoke() {
        CokeFactory cokeFactory = getCokeFactory();
        return cokeFactory.produce();
    }

    /**
     * 生产鞋子
     *
     * @return 鞋子
     */
    public Product produceShoe() {
        ShoeFactory shoeFactory = getShoeFactory();
        return shoeFactory.produce();
    }

    /**
     * 获取可乐工厂
     *
     * @return 可乐工厂
     */
    public CokeFactory getCokeFactory() {
        CokeFactory result = cokeFactory;
        if (result == null) {
            synchronized (this) {
                if (cokeFactory == null) {
                    cokeFactory = result = new CokeFactory();
                }
            }
        }

        return result;
    }

    /**
     * 获取鞋子工厂
     *
     * @return 鞋子工厂
     */
    public ShoeFactory getShoeFactory() {
        ShoeFactory result = shoeFactory;
        if (result == null) {
            synchronized (this) {
                if (shoeFactory == null) {
                    shoeFactory = result = new ShoeFactory();
                }
            }
        }

        return result;
    }


}