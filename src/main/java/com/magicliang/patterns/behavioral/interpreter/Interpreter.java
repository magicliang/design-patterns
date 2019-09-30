package com.magicliang.patterns.behavioral.interpreter;

/**
 * project name: design-patterns
 * <p>
 * description: 解释器接口
 *
 * @author magicliang
 * <p>
 * date: 2019-09-29 19:11
 */
public interface Interpreter {

    /**
     * 解释上下文
     *
     * @param context 上下文
     */
    void interpret(Context context);
}
