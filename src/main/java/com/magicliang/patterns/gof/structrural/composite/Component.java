package com.magicliang.patterns.gof.structrural.composite;

/**
 * project name: design-patterns
 * <p>
 * description: 基础组件接口
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 21:58
 */
public interface Component {

    /**
     * 增加组件
     *
     * @param component 待增加组件
     */
    void add(Component component);

    /**
     * 删除组件
     *
     * @param component 待删除组件
     * @return 操作结果
     */
    boolean delete(Component component);

    /**
     * 获取特定位置的孩子节点
     *
     * @return 孩子节点
     */
    Component getChild(int index);

    /**
     * 组件操作
     */
    void operation();
}
