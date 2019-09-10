package com.magicliang.patterns.creational;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * name: SimpileFactoryPatternTest
 * <p>
 * description: 工厂方法模式测试
 *
 * @author magicliang
 * @date 2019-09-10 09:54
 */
public class FactoryMethodPatternTest {


    @Test
    public void testProduceCoke() {
        FactoryMethodPattern factoryMethodPattern = new FactoryMethodPattern();
        Product product = factoryMethodPattern.produceCoke();
        assertEquals(ProductTypeEnum.Coke, product.type());
    }

    @Test
    public void testProduceShoe() {
        FactoryMethodPattern factoryMethodPattern = new FactoryMethodPattern();
        Product product = factoryMethodPattern.produceShoe();
        assertEquals(ProductTypeEnum.Shoe, product.type());
    }
}