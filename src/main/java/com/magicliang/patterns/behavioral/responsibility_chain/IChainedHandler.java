package com.magicliang.patterns.behavioral.responsibility_chain;

/**
 * project name: design-patterns
 * <p>
 * description: 责任链模式
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 14:21
 */
public interface IChainedHandler<Request> {

    /**
     * 处理请求
     *
     * @param request 请求
     */
    void handle(Request request);
}
