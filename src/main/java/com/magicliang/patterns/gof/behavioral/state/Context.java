package com.magicliang.patterns.gof.behavioral.state;

import lombok.Data;

/**
 * project name: design-patterns
 * <p>
 * description: 上下文
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:14
 */
@Data
public class Context {

    /**
     * 上下文内部状态
     */
    private State state;

}
