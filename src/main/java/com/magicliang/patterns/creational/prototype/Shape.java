package com.magicliang.patterns.creational.prototype;

/**
 * project name: design-patterns
 * <p>
 * description: 基本形状，支持 clone
 *
 * @author magicliang
 * date: 2019-09-10 23:24
 */
public class Shape implements Cloneable {
    /**
     * id
     */
    private String id;

    /**
     * 类型
     */
    private String type;

    /**
     * 用于深拷贝的对象
     */
    private Object object;

    /**
     * 公有构造函数
     *
     * @param id   id
     * @param type 类型
     */
    public Shape(String id, String type) {
        this.id = id;
        this.type = type;
        this.object = new Object();
    }

    /**
     * get the value of id
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * set the value of the id
     *
     * @param id the value of id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get the value of type
     *
     * @return the value of type
     */
    public String getType() {
        return type;
    }

    /**
     * set the value of the type
     *
     * @param type the value of type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get the value of object
     *
     * @return the value of object
     */
    public Object getObject() {
        return object;
    }

    /**
     * set the value of the object
     *
     * @param object the value of object
     */
    public void setObject(Object object) {
        this.object = object;
    }

    /**
     * clone方法
     *
     * @return 新实例
     * @throws CloneNotSupportedException 不支持clone的异常
     */
    @Override
    protected Shape clone() throws CloneNotSupportedException {
        Shape result = (Shape) super.clone();
        result.setObject(new Object());
        return result;
    }
}
