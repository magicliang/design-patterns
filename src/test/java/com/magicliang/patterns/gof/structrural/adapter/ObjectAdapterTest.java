package com.magicliang.patterns.gof.structrural.adapter;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-12 16:38
 */
public class ObjectAdapterTest {

    @Test
    public void testRequest() {
        ObjectAdapter objectAdapter = new ObjectAdapter();
        objectAdapter.setAdapted(new Adapted());
        assertNotNull(objectAdapter.request());
    }
}