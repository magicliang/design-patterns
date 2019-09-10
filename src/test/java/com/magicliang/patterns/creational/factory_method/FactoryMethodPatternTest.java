package com.magicliang.patterns.creational.factory_method;

import com.magicliang.patterns.enums.ProductTypeEnum;
import com.magicliang.patterns.model.Product;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * @date 2019-09-10 17:45
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