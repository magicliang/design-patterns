package com.magicliang.patterns.structrural.proxy;

/**
 * project name: design-patterns
 * <p>
 * description: 代理
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 21:47
 */
public class SubjectProxy implements Subject {

    /**
     * 真实客体
     */
    private Subject realSubject;

    /**
     * 注意，代理模式的客体是强生命周期关联的，是组合关系，在构造函数中必须体现这一点
     *
     * @param realSubject 真实客体
     */
    public SubjectProxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    /**
     * 请求接口
     */
    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    /**
     * 预处理
     */
    private void preRequest() {
        System.out.println("SubjectProxy.preRequest()");

    }

    /**
     * 后处理
     */
    private void postRequest() {
        System.out.println("SubjectProxy.postRequest()");
    }
}
