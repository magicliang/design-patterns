package com.magicliang.patterns.gof.structrural.adapter;

/**
 * project name: design-patterns
 * <p>
 * description: 被适配对象
 *
 * @author magicliang
 * <p>
 * date: 2019-09-12 16:31
 */
public class Adapted {
    public Object specialRequest() {
        System.out.println("specialRequest");
        return new Object();
    }
}
