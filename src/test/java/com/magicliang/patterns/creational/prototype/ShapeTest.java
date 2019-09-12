package com.magicliang.patterns.creational.prototype;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * date: 2019-09-10 23:36
 */
public class ShapeTest {

    @Test
    public void testTestClone() throws CloneNotSupportedException {
        Shape shape1 = new Shape("1", "2");
        Shape shape2 = shape1.clone();

        // 浅拷贝严格相等
        assertTrue(shape1.getId() == shape2.getId());
        assertTrue(shape1.getType() == shape2.getType());

        // 深拷贝严格不相等
        assertTrue(shape1.getObject() != shape2.getObject());
    }
}