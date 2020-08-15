package com.magicliang.patterns.behavioral.visitor;

import java.io.File;

/**
 * project name: design-patterns
 * <p>
 * description: 类文件访问者
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:54
 */
public class ClassFileCleanerVisitor implements Visitor {

    @Override
    public void visitDir(File dir) {
    }

    @Override
    public void visitFile(File file) {
        if (file.getName().endsWith(".class")) {
            System.out.println("Will clean class file: " + file);
        }
    }
}
