package com.magicliang.patterns.gof.structrural.flyweight;

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
    private final Integer intrinsicState;

    /**
     * 环境状态
     */
    private Integer extrinsicState;

    /**
     * 构造器
     *
     * @param intrinsicState 内生状态
     */
    public Flyweight(Integer intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    /**
     * get the value of intrinsicState
     *
     * @return the value of intrinsicState
     */
    public Integer getIntrinsicState() {
        return intrinsicState;
    }

    /**
     * get the value of extrinsicState
     *
     * @return the value of extrinsicState
     */
    public Integer getExtrinsicState() {
        return extrinsicState;
    }

    /**
     * set the value of the extrinsicState
     *
     * @param extrinsicState the value of extrinsicState
     */
    public void setExtrinsicState(Integer extrinsicState) {
        this.extrinsicState = extrinsicState;
    }
}
