package com.magicliang.patterns.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * project name: design-patterns
 * <p>
 * description: 产品类型枚举
 *
 * @author magicliang
 * date: 2019-09-10 17:27
 */
public enum ProductTypeEnum {
    /**
     * 可乐
     */
    Coke("coke"),
    /**
     * 鞋子
     */
    Shoe("shoe"),
    ;

    /**
     * 类型
     */
    private final String type;

    /**
     * 构造函数
     *
     * @param type 产品类型
     */
    ProductTypeEnum(String type) {
        this.type = type;
    }

    /**
     * 通过类型获取枚举
     *
     * @param type 类型
     * @return 枚举
     */
    ProductTypeEnum getByType(String type) {
        if (StringUtils.isBlank(type)) {
            return null;
        }
        for (ProductTypeEnum typeEnum : ProductTypeEnum.values()) {
            if (StringUtils.equals(typeEnum.getType(), type)) {
                return typeEnum;
            }
        }
        return null;
    }

    /**
     * get the value of type
     *
     * @return the value of type
     */
    public String getType() {
        return type;
    }
}
