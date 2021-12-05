package com.magicliang.patterns.gof.structrural.facade;

/**
 * project name: design-patterns
 * <p>
 * description: B系统
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 16:02
 */
public class BsystemImpl implements Service {

    /**
     * 服务操作
     */
    @Override
    public void operation() {
        System.out.println("SystemB");
    }
}
