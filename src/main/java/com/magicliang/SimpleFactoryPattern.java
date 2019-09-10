package com.magicliang;

import org.apache.commons.lang3.StringUtils;

/**
 * name: design-patterns
 * <p>
 * description: 简单工厂模式，使用泛型
 *
 * @author magicliang
 * @date 2019-09-09 22:44
 */
public class SimpleFactoryPattern {

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
     * @return 可乐
     */
    Product produceCoke() {
        CokeFactory cokeFactory = getCokeFactory();
        return cokeFactory.produce();
    }

    /**
     * 生产鞋子
     * @return 鞋子
     */
    Product produceShoe() {
        ShoeFactory shoeFactory = getShoeFactory();
        return shoeFactory.produce();
    }
    /**
     * 获取可乐工厂
     * @return 可乐工厂
     */
    public CokeFactory getCokeFactory() {
        CokeFactory result = cokeFactory;
        if (result == null) {
            synchronized (this) {
                result = cokeFactory;
                if (result == null) {
                    result = cokeFactory = new CokeFactory();
                }
            }
        }

        return result;
    }

    /**
     * 获取鞋子工厂
     * @return 鞋子工厂
     */
    public ShoeFactory getShoeFactory() {
        ShoeFactory result = shoeFactory;
        if (result == null) {
            synchronized (this) {
                result = shoeFactory;
                if (result == null) {
                    result = shoeFactory = new ShoeFactory();
                }
            }
        }

        return result;
    }


}

/**
 * 产品类型美剧
 */
enum ProductTypeEnum {
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
    private String type;

    /**
     * 构造函数
     * @param type 产品类型
     */
    ProductTypeEnum(String type) {
        this.type = type;
    }

    /**
     * 通过类型获取枚举
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

/**
 * tagging interface
 * 产品接口
 */
interface Product {
    /**
     * 产品类型
     * @return 产品类型
     */
    ProductTypeEnum type();
}

/**
 * 可乐
 */
class Coke implements Product {
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

/**
 * 鞋子
 */
class Shoe implements Product {
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

/**
 * 简单工厂接口
 */
interface SimpleFactory<T extends Product> {
    /**
     * 生产产品
     * @return 产品
     */
    T produce();
}

/**
 * 可乐工厂接口
 */
class CokeFactory implements SimpleFactory<Coke> {
    /**
     * 生产产品
     * @return 产品
     */
    public Coke produce() {
        return new Coke();
    }
}

/**
 * 鞋子工厂接口
 */
class ShoeFactory implements SimpleFactory<Shoe> {
    /**
     * 生产产品
     * @return 产品
     */
    public Shoe produce() {
        return new Shoe();
    }
}