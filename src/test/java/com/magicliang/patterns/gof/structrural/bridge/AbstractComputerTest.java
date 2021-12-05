package com.magicliang.patterns.gof.structrural.bridge;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-12 19:14
 */
public class AbstractComputerTest {

    @Test
    public void testCalculate() {
        AbstractComputer computer = new ConcreteComputerImpl(new ColorPrinter());
        assertEquals(1, computer.calculate());
    }
}