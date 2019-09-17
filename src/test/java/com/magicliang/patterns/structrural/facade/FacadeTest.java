package com.magicliang.patterns.structrural.facade;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 16:05
 */
public class FacadeTest {

    @Test
    public void testWrapOperation() {
        Facade facade = new FacadeImpl(new AsystemImpl(), new BsystemImpl());
        facade.wrapOperation();
        assertNotNull(facade);
    }
}