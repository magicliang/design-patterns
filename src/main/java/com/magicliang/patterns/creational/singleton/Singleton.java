package com.magicliang.patterns.creational.singleton;

/**
 * name: design-patterns
 * <p>
 * description: 单例模式
 *
 * @author magicliang
 * @date 2019-09-10 22:31
 */
public class Singleton {

    /**
     * 饿汉模式单例
     */
    public static final Singleton singleton1 = new Singleton();

    /**
     * 懒汉模式单例
     */
    private volatile Singleton singleton2;

    /**
     * 单例模式
     */
    private Singleton() {
    }

    /**
     * get the value of singleton2
     *
     * @return the value of singleton2
     */
    public Singleton getSingleton2() {
        Singleton result = singleton2;
        if (result == null) {
            synchronized (this) {
                if (singleton2 == null) {
                    singleton2 = result = new Singleton();
                }
            }
        }
        return result;
    }
}
