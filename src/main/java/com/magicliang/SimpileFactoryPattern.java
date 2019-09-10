package com.magicliang;

/**
 * name: design-patterns
 * <p>
 * description: 简单工厂模式
 *
 * @author magicliang
 * @date 2019-09-09 22:44
 */
public class SimpileFactoryPattern {

    /**
     * 可乐工厂
     */
    private CokeFactory cokeFactory;

    /**
     * 鞋子工厂
     */
    private ShoeFactory shoeFactory;

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
        if (cokeFactory == null) {
            synchronized (this) {
                if (cokeFactory == null) {
                    cokeFactory = new CokeFactory();
                }
            }
        }

        return cokeFactory;
    }

    /**
     * 获取鞋子工厂
     * @return 鞋子工厂
     */
    public ShoeFactory getShoeFactory() {
        if (shoeFactory == null) {
            synchronized (this) {
                if (shoeFactory == null) {
                    shoeFactory = new ShoeFactory();
                }
            }
        }

        return shoeFactory;
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
    private String type;

    /**
     * 构造函数
     * @param type 产品类型
     */
    ProductTypeEnum(String type) {
        this.type = type;
    }

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