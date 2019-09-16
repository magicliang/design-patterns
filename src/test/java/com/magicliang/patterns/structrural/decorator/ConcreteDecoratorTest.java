package com.magicliang.patterns.structrural.decorator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 15:22
 */
public class ConcreteDecoratorTest {

    @Test
    public void testOperation() {
        Component component = new BasicComponent();
        assertTrue(component.operation());
        Component decorator = new ConcreteDecorator(component);
        assertTrue(decorator.operation());
    }
}