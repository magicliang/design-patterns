package com.magicliang.patterns.structrural.proxy;

/**
 * project name: design-patterns
 * <p>
 * description: 真实客体
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 21:46
 */
public class RealSubject implements Subject {

    /**
     * 请求接口
     */
    @Override
    public void request() {
        System.out.println("RealSubject.request()");
    }
}
