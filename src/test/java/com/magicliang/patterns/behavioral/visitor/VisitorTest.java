package com.magicliang.patterns.behavioral.visitor;

import org.testng.annotations.Test;

import java.io.File;

/**
 * project name: design-patterns
 * <p>
 * description: 访问者模式的测试
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:57
 */
public class VisitorTest {

    @Test
    public static void testVisitor() {
        FileStructure fs = new FileStructure(new File("."));
        fs.handle(new JavaFileVisitor());
    }
}
