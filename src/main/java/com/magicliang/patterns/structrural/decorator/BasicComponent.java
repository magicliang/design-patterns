package com.magicliang.patterns.structrural.decorator;

/**
 * project name: design-patterns
 * <p>
 * description: 基础组件
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 15:14
 */
public class BasicComponent implements Component {

    /**
     * 基础操作接口
     *
     * @return 操作结果
     */
    @Override
    public boolean operation() {
        System.out.println("BasicComponent");
        return true;
    }

}
