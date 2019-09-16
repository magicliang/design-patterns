package com.magicliang.patterns.structrural.facade;

/**
 * project name: design-patterns
 * <p>
 * description: A系统
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 16:01
 */
public class SystemA implements Service {

    /**
     * 服务操作
     */
    @Override
    public void operation() {
        System.out.println("SystemA");
    }
}
