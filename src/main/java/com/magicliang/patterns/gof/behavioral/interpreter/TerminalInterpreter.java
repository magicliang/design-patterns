package com.magicliang.patterns.gof.behavioral.interpreter;

import lombok.extern.slf4j.Slf4j;

/**
 * project name: design-patterns
 * <p>
 * description: 终止解释器
 *
 * @author magicliang
 * <p>
 * date: 2019-09-29 19:24
 */
@Slf4j
public class TerminalInterpreter implements Interpreter {

    /**
     * 解释上下文
     *
     * @param context 上下文
     */
    @Override
    public void interpret(Context context) {
        log.info("TerminalInterpreter" + context.getRequest());
    }
}
