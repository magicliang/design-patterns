package com.magicliang.patterns.structrural.proxy;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 21:50
 */
public class SubjectTest {

    @Test
    public void testRequest() {
        Subject subject = new SubjectProxy(new RealSubject());
        subject.request();
        assertNotNull(subject);
    }
}