package com.magicliang.patterns.behavioral.responsibility_chain;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

/**
 * project name: design-patterns
 * <p>
 * description: 抽象责任链处理器
 * 注意泛型形参要一脉相承
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 14:37
 */
@Getter
@Setter
@Log
public abstract class AbstractChainedHandler<Request> implements IChainedHandler<Request> {

    /**
     * 继任者
     */
    private IChainedHandler<Request> successor;

    /**
     * 处理请求
     *
     * @param request 请求
     */
    @Override
    public void handle(Request request) {
        realHandle(request);
        IChainedHandler<Request> successor = getSuccessor();
        if (null != successor) {
            successor.handle(request);
        }
    }

    /**
     * 真处理逻辑
     *
     * @param request 请求
     */
    protected abstract void realHandle(Request request);
}
