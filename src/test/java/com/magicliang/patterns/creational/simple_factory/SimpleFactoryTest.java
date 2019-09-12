package com.magicliang.patterns.creational.simple_factory;

import com.magicliang.enums.ProductTypeEnum;
import com.magicliang.model.Product;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

import static org.testng.Assert.assertEquals;


/**
 * project name: design-patterns
 * <p>
 * description: 测试简单工厂模式的结果
 *
 * @author magicliang
 * date: 2019-09-10 17:57
 */
public class SimpleFactoryTest {

    @Test
    public void testCreateProduct() {

        Product product = SimpleFactory.createProduct(ProductTypeEnum.Coke);
        assertNotNull(product);
        assertEquals(ProductTypeEnum.Coke, product.type());

        product = SimpleFactory.createProduct(ProductTypeEnum.Shoe);
        assertNotNull(product);
        assertEquals(ProductTypeEnum.Shoe, product.type());

    }
}