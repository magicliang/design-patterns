package com.magicliang.patterns.gof.behavioral.visitor;

import java.io.File;

/**
 * project name: design-patterns
 * <p>
 * description: 文件数据结构
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:49
 */
public class FileStructure {

    /**
     * 根目录
     */
    private File path;


    public FileStructure(File path) {
        this.path = path;
    }

    public void handle(Visitor visitor) {
        scan(this.path, visitor);
    }

    private void scan(File file, Visitor visitor) {
        if (file.isDirectory()) {
            // 让访问者处理文件夹:
            visitor.visitDir(file);
            for (File sub : file.listFiles()) {
                // 递归处理子文件夹:
                scan(sub, visitor);
            }
        } else if (file.isFile()) {
            // 让访问者处理文件:
            visitor.visitFile(file);
        }
    }
}
