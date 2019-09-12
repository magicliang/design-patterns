package com.magicliang.patterns.creational.abstract_factory;

import com.magicliang.enums.ProductTypeEnum;
import com.magicliang.model.Product;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * date: 2019-09-12 15:06
 */
public class ConcreteProductFactoryTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testCreateCoke() {
        ConcreteProductFactory factory = new ConcreteProductFactory();
        Product product = factory.createCoke();
        assertEquals(ProductTypeEnum.Coke, product.type());
    }

    @Test
    public void testCreateShoe() {
        ConcreteProductFactory factory = new ConcreteProductFactory();
        Product product = factory.createShoe();
        assertEquals(ProductTypeEnum.Shoe, product.type());
    }
}