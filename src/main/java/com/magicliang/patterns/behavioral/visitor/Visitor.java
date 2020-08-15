package com.magicliang.patterns.behavioral.visitor;

import java.io.File;

/**
 * project name: design-patterns
 * <p>
 * description: 访问者接口
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:48
 */
public interface Visitor {

    /**
     * 访问文件夹
     *
     * @param dir 文件夹
     */
    void visitDir(File dir);

    /**
     * 访问文件
     *
     * @param file 文件
     */
    void visitFile(File file);
}
