/**
 * project name: design-patterns
 * <p>
 * description: 协调者模式
 * 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，
 * 而且可以独立地改变它们之间的交互。中介者模式又称为调停者模式，它是一种对象行为型模式。
 * <p>
 * producer - broker -consumer 的模式就是 mediator 模式的一个变种
 * <p>
 * mediator 并不是 command 模式，command 模式里只是封装了 receiver。存在单向耦合关系。
 * <p>
 * 而mediator则封装了全部的 colleague，依赖被反转了。
 * <p>
 * 这是一种把通信解耦的设计模式。mediator 就是 esb，esb就是mediator。controller 也是 mediator。
 * <p>
 * 在中介者模式中，通过创造出一个中介者对象，将系统中有关的对象所引用的其他对象数目减少到最少，使得一个
 * 对象与其同事之间的相互作用被这个对象与中介者对象之间的相互作用所取代。因此，中介者模式就是迪米特法则
 * 的一个典型应用。
 *
 * 中介者模式本身是将服务编排的操作复杂度汇总到中介者里
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 23:06
 */
package com.magicliang.patterns.gof.behavioral.mediator;