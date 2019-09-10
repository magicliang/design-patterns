package com.magicliang.patterns.creational.simple_factory;

import com.magicliang.patterns.enums.ProductTypeEnum;
import com.magicliang.patterns.model.Product;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * project name: design-patterns
 * <p>
 * description: 测试简单工厂模式的结果
 *
 * @author magicliang
 * @date 2019-09-10 17:57
 */
public class ConcretSimpleFactoryTest {

    @Test
    public void testCreateProduct() {
        ConcretSimpleFactory concretSimpleFactory = new ConcretSimpleFactory();

        Product product = concretSimpleFactory.createProduct(ProductTypeEnum.Coke);
        assertNotNull(product);
        assertEquals(ProductTypeEnum.Coke, product.type());

        product = concretSimpleFactory.createProduct(ProductTypeEnum.Shoe);
        assertNotNull(product);
        assertEquals(ProductTypeEnum.Shoe, product.type());

    }
}