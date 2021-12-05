package com.magicliang.patterns.gof.creational.singleton;

/**
 * project name: design-patterns
 * <p>
 * description: 单例模式
 *
 * @author magicliang
 * date: 2019-09-10 22:31
 */
public class Singleton {

    /**
     * 饿汉模式单例
     */
    public static final Singleton SINGLETON = new Singleton();

    /**
     * 懒汉模式单例
     */
    private volatile Singleton lazySingleton;

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
    public Singleton getLazySingleton() {
        Singleton result = lazySingleton;
        if (result == null) {
            synchronized (this) {
                if (lazySingleton == null) {
                    lazySingleton = result = new Singleton();
                }
            }
        }
        return result;
    }
}
