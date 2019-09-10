package com.magicliang.patterns.model;

import com.magicliang.patterns.enums.ProductTypeEnum;

/**
 * project name: design-patterns
 * <p>
 * description: 鞋子
 *
 * @author magicliang
 * @date 2019-09-10 17:25
 */
public class Shoe implements Product {

    /**
     * 产品类型
     *
     * @return 产品类型
     */
    @Override
    public ProductTypeEnum type() {
        return ProductTypeEnum.Shoe;
    }
}
