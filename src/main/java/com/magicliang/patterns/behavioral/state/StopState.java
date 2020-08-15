package com.magicliang.patterns.behavioral.state;

/**
 * project name: design-patterns
 * <p>
 * description: 停止状态
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:16
 */
public class StopState implements State {

    /**
     * 接收上下文进行操作
     *
     * @param context 上下文
     */
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
