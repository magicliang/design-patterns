package com.magicliang.patterns.structrural.decorator;

/**
 * project name: design-patterns
 * <p>
 * description: 具体的装饰器
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 15:16
 */
public class ConcreteDecorator implements DecoratorComponent {

    /**
     * 被装饰组件
     */
    private Component component;

    /**
     * 构造函数
     */
    public ConcreteDecorator() {
        super();
    }

    /**
     * 构造函数
     *
     * @param component 被装饰组件
     */
    public ConcreteDecorator(Component component) {
        this();
        this.component = component;
    }

    /**
     * 增加操作
     */
    @Override
    public void addBehavior() {
        System.out.println("addBehavior");
    }

    /**
     * 基础操作接口
     *
     * @return 操作结果
     */
    @Override
    public boolean operation() {
        boolean result = component.operation();
        addBehavior();
        return result;
    }

}
