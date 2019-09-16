package com.magicliang.patterns.structrural.composite;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 22:09
 */
public class ComponentTest {

    @Test
    public void testOperation() {
        Component firstLevelComponent = new Composite("firstLevelComponent");
        Component secondLevelComponent = new Composite("secondLevelComponent");
        Component leaf = new Leaf();
        secondLevelComponent.add(leaf);
        firstLevelComponent.add(secondLevelComponent);
        firstLevelComponent.operation();
        assertNotNull(firstLevelComponent);
    }
}