package com.magicliang.patterns.behavioral;

import lombok.extern.slf4j.Slf4j;

/**
 * project name: design-patterns
 * <p>
 * description: 具体的处理类
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 15:11
 */
@Slf4j
public class ConcreteChainedToJsonHandler extends AbstractChainedHandler<Object> {
    /**
     * 真处理逻辑
     *
     * @param o 请求
     */
    @Override
    void realHandle(Object o) {
        log.info(o.toString());
    }
}
