/**
 * project name: design-patterns
 * <p>
 * description: 观察者模式
 * <p>
 * 定义对象之间的一种一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。
 * 观察者模式的别名包括发布-订阅（Publish/Subscribe）模式、模型-视图（Model/View）模式、源-监听器
 * （Source/Listener）模式或从属者（Dependents）模式。观察者模式是一种对象行为型模式。
 * <p>
 * 观察者模式是事件驱动架构的起点。它提供了一连串的 event stream 来串起整个软件架构。特别是把 event 作
 * 为参数的设计，可以说是开创性的。
 * <p>
 * 观察者模式可以解决以下问题：
 * <p>
 * 对象之间存在一对多的关系，却不需要紧耦合在一起。
 * <p>
 * 需要保证一个状态更新，可以级联更新/通知其他大量对象。
 * <p>
 * 原始的观察者模式容易导致内存泄漏
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 20:13
 */
package com.magicliang.patterns.gof.behavioral.observer;