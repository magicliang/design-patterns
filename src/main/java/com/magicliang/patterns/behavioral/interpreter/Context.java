package com.magicliang.patterns.behavioral.interpreter;

import lombok.Data;

/**
 * project name: design-patterns
 * <p>
 * description: 上下文
 *
 * @author magicliang
 * <p>
 * date: 2019-09-29 18:45
 */

@Data
public class Context {

    /**
     * 请求
     */
    private String request;

    /**
     * 响应
     */
    private String response;

}
