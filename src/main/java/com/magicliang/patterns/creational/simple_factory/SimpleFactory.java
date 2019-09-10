package com.magicliang.patterns.creational.simple_factory;

import com.magicliang.patterns.enums.ProductTypeEnum;
import com.magicliang.patterns.model.Product;

/**
 * project name: design-patterns
 * <p>
 * description: 简单工厂接口
 *
 * @author magicliang
 * @date 2019-09-10 20:00
 */
public interface SimpleFactory {

    /**
     * 生产产品接口
     *
     * @param type 产品类型
     * @return 产品
     */
    Product createProduct(ProductTypeEnum type);
}
