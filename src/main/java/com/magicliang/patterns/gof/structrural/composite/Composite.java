package com.magicliang.patterns.gof.structrural.composite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * project name: design-patterns
 * <p>
 * description: 组合类
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 22:01
 */
public class Composite implements Component {

    /**
     * 组件集合
     */
    private List<Component> components = Lists.newArrayList();

    /**
     * 组件名称
     */
    private String name;

    /**
     * 构造器
     *
     * @param name 组合名称
     */
    public Composite(String name) {
        this.name = name;
    }

    /**
     * 增加组件
     *
     * @param component 待增加组件
     */
    @Override
    public void add(Component component) {
        components.add(component);
    }

    /**
     * 删除组件
     *
     * @param component 待删除组件
     * @return 操作结果
     */
    @Override
    public boolean delete(Component component) {
        return components.remove(component);
    }

    /**
     * 获取特定位置的孩子节点
     *
     * @return 孩子节点
     */
    @Override
    public Component getChild(int index) {
        return components.get(index);
    }

    /**
     * 组件操作
     */
    @Override
    public void operation() {
        System.out.println(name);
        components.forEach(Component::operation);
    }
}
