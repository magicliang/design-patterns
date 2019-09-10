package com.magicliang.patterns.creational.factory_method;

import com.magicliang.patterns.model.Product;

/**
 * project name: design-patterns
 * <p>
 * description: 工厂方法接口
 *
 * @author magicliang
 * @date 2019-09-10 17:31
 */
public interface AbstractFactory<T extends Product> {
    /**
     * 生产产品
     *
     * @return 产品
     */
    T produce();
}
