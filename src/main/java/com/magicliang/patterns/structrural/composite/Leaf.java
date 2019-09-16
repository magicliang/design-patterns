package com.magicliang.patterns.structrural.composite;

/**
 * project name: design-patterns
 * <p>
 * description: 叶子组件
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 21:59
 */
public class Leaf implements Component {

    /**
     * 增加组件
     *
     * @param component 待增加组件
     */
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Leaf component does not support this operation");
    }

    /**
     * 删除组件
     *
     * @param component 待删除组件
     * @return 操作结果
     */
    @Override
    public boolean delete(Component component) {
        throw new UnsupportedOperationException("Leaf component does not support this operation");
    }

    /**
     * 获取特定位置的孩子节点
     *
     * @param index
     * @return 孩子节点
     */
    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("Leaf component does not support this operation");
    }

    /**
     * 组件操作
     */
    @Override
    public void operation() {
        System.out.println("Leaf");
    }
}
