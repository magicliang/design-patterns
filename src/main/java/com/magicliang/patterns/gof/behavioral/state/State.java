package com.magicliang.patterns.gof.behavioral.state;

/**
 * project name: design-patterns
 * <p>
 * description: 状态接口
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:14
 */
public interface State {

    /**
     * 接收上下文进行操作
     *
     * @param context 上下文
     */
    public void doAction(Context context);

}
