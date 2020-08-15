/**
 * project name: design-patterns
 * <p>
 * description: 状态模式
 * 使用状态模式的对象总体而言，既要包含对象，又要自己写一个大 map、switch-case、if-else 来分派 state 之间的变化。
 * 但状态之间的前序依赖光靠简单的条件语句不好指定 - 这时候可以让 state 自己指定前驱和后继，这是 state 模式的高级形式。
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:09
 */
package com.magicliang.patterns.behavioral.state;