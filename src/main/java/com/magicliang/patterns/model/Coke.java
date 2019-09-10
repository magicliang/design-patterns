package com.magicliang.patterns.model;

import com.magicliang.patterns.enums.ProductTypeEnum;

/**
 * project name: design-patterns
 * <p>
 * description: 可乐
 *
 * @author magicliang
 * @date 2019-09-10 17:23
 */
public class Coke implements Product {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 容量
     */
    private long volume;

    /**
     * get the value of brand
     *
     * @return the value of brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * set the value of the brand
     *
     * @param brand the value of brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * get the value of volume
     *
     * @return the value of volume
     */
    public long getVolume() {
        return volume;
    }

    /**
     * set the value of the volume
     *
     * @param volume the value of volume
     */
    public void setVolume(long volume) {
        this.volume = volume;
    }

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
