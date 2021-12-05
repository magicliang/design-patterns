package com.magicliang.patterns.gof.behavioral.visitor;

import java.io.File;

/**
 * project name: design-patterns
 * <p>
 * description: 具体文件访问者
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:50
 */
public class JavaFileVisitor implements Visitor {

    @Override
    public void visitDir(File dir) {
        System.out.println("Visit dir: " + dir);
    }

    @Override
    public void visitFile(File file) {
        if (file.getName().endsWith(".java")) {
            System.out.println("Found java file: " + file);
        }
    }
}
