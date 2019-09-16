package com.magicliang.patterns.structrural.facade;

/**
 * project name: design-patterns
 * <p>
 * description: B系统
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 16:02
 */
public class SystemB implements Service {
    
    /**
     * 服务操作
     */
    @Override
    public void operation() {
        System.out.println("SystemB");
    }
}
