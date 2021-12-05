package com.magicliang.patterns.gof.structrural.decorator;

/**
 * project name: design-patterns
 * <p>
 * description: 装饰器组件
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 15:15
 */
public interface DecoratorComponent extends Component {
    /**
     * 增加操作
     */
    void addBehavior();
}
