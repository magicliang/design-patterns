package com.magicliang.patterns.structrural.flyweight;

/**
 * project name: design-patterns
 * <p>
 * description: 享元类
 *
 * @author magicliang
 * <p>
 * date: 2019-09-16 16:23
 */
public class Flyweight {

    /**
     * 内生状态
     */
    private final Integer intrisicState;

    /**
     * 环境状态
     */
    private Integer extrisicState;

    /**
     * 构造器
     *
     * @param intrisicState 内生状态
     */
    public Flyweight(Integer intrisicState) {
        this.intrisicState = intrisicState;
    }

    /**
     * get the value of intrisicState
     *
     * @return the value of intrisicState
     */
    public Integer getIntrisicState() {
        return intrisicState;
    }

    /**
     * get the value of extrisicState
     *
     * @return the value of extrisicState
     */
    public Integer getExtrisicState() {
        return extrisicState;
    }

    /**
     * set the value of the extrisicState
     *
     * @param extrisicState the value of extrisicState
     */
    public void setExtrisicState(Integer extrisicState) {
        this.extrisicState = extrisicState;
    }
}
