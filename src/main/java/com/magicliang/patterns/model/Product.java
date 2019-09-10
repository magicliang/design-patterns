package com.magicliang.patterns.model;

import com.magicliang.patterns.enums.ProductTypeEnum;

/**
 * project name: design-patterns
 * <p>
 * description:
 * tagging interface
 * 产品接口
 *
 * @author magicliang
 * @date 2019-09-10 17:28
 */
public interface Product {
    /**
     * 产品类型
     *
     * @return 产品类型
     */
    ProductTypeEnum type();
}
