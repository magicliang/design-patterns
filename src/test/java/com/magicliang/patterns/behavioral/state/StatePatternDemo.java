package com.magicliang.patterns.behavioral.state;

/**
 * project name: design-patterns
 * <p>
 * description: 状态模式测试
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:18
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
