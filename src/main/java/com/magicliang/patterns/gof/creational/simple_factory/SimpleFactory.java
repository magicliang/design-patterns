package com.magicliang.patterns.gof.creational.simple_factory;

import com.magicliang.enums.ProductTypeEnum;
import com.magicliang.model.Coke;
import com.magicliang.model.Product;
import com.magicliang.model.Shoe;

/**
 * project name: design-patterns
 * <p>
 * description: 简单工厂模式，无法使用泛型
 * Spring 中的 static factory method 都使用这种模式
 * 消耗资源的操作不应该放在构造器里执行。
 * 应该单独使用 init-destroy 类的方法管理这些指责，而且明确根据容器的生命周期来管理
 *
 * @author magicliang
 * date: 2019-09-10 17:23
 */
public class SimpleFactory {

    /**
     * 生产产品接口
     *
     * @param type 产品类型
     * @return 产品
     */
    public static Product createProduct(ProductTypeEnum type) {
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
