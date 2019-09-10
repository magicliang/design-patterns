package com.magicliang.patterns.creational;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * name: SimpileFactoryPatternTest
 * <p>
 * description: 简单工厂模式测试
 *
 * @author magicliang
 * @date 2019-09-10 09:54
 */
public class SimpleFactoryPatternTest {


    @Test
    public void testProduceCoke() {
        SimpleFactoryPattern simpleFactoryPattern = new SimpleFactoryPattern();
        Product product = simpleFactoryPattern.produceCoke();
        assertEquals(ProductTypeEnum.Coke, product.type());
    }

    @Test
    public void testProduceShoe() {
        SimpleFactoryPattern simpleFactoryPattern = new SimpleFactoryPattern();
        Product product = simpleFactoryPattern.produceShoe();
        assertEquals(ProductTypeEnum.Shoe, product.type());
    }
}