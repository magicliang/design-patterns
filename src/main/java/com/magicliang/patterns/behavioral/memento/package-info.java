/**
 * project name: design-patterns
 * <p>
 * description: 备忘录模式
 * 备忘录模式是在外部存储一个对象的旧（previous）内部（internal）状态，并提供恢复机制的一种模式。
 * <p>
 * 它分为：originator, a caretaker and a memento
 * <p>
 * 备忘录模式提供了一种状态恢复的实现机制，使得用户可以方便地回到一个特定的历史步骤，当新的状态无效
 * 或者存在问题时，可以使用暂时存储起来的备忘录将状态复原，当前很多软件都提供了撤销操作，其中就使用
 * 了备忘录模式。
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 19:00
 */
package com.magicliang.patterns.behavioral.memento;