package com.magicliang;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * name: SimpileFactoryPatternTest
 * <p>
 * description: 简单工厂模式测试
 *
 * @author magicliang
 * @date 2019-09-10 09:54
 */
public class SimpileFactoryPatternTest {


    @Test
    public void testProduceCoke() {
        SimpileFactoryPattern simpileFactoryPattern = new SimpileFactoryPattern();
        Product product = simpileFactoryPattern.produceCoke();
        assertEquals(ProductTypeEnum.Coke, product.type());
    }

    @Test
    public void testProduceShoe() {
        SimpileFactoryPattern simpileFactoryPattern = new SimpileFactoryPattern();
        Product product = simpileFactoryPattern.produceShoe();
        assertEquals(ProductTypeEnum.Shoe, product.type());
    }
}