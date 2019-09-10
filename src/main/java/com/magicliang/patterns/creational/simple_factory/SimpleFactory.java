package com.magicliang.patterns.creational.simple_factory;

import com.google.common.collect.Lists;
import com.magicliang.patterns.enums.ProductTypeEnum;
import com.magicliang.patterns.model.Coke;
import com.magicliang.patterns.model.Product;
import com.magicliang.patterns.model.Shoe;

import java.util.List;

/**
 * name: design-patterns
 * <p>
 * description: 简单工厂模式，无法使用泛型
 * Spring 中的 static factory method 都使用这种模式
 *
 * @author magicliang
 * @date 2019-09-10 17:23
 */
public class SimpleFactory {

    private final static List<Class<?>> CLASSES = Lists.newArrayList(Coke.class, Shoe.class);

    public Product createProduct(ProductTypeEnum type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case Coke:
                return new Coke();
            case Shoe:
                return new Shoe();
            default:
                return null;
        }
    }
}
