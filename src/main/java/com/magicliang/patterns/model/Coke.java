package com.magicliang.patterns.model;

import com.magicliang.patterns.enums.ProductTypeEnum;

/**
 * name: design-patterns
 * <p>
 * description: 可乐
 *
 * @author magicliang
 * @date 2019-09-10 17:23
 */
public class Coke implements Product {
    /**
     * 产品类型
     *
     * @return 产品类型
     */
    @Override
    public ProductTypeEnum type() {
        return ProductTypeEnum.Coke;
    }
}
