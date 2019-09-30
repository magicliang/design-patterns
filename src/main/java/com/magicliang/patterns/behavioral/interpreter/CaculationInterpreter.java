package com.magicliang.patterns.behavioral.interpreter;

import java.util.Map;

/**
 * project name: design-patterns
 * <p>
 * description: 计算解释器器
 *
 * @author magicliang
 * <p>
 * date: 2019-09-29 19:34
 */
public class CaculationInterpreter {

    @FunctionalInterface
    public interface Expr {

        /**
         * 解释
         *
         * @param context 上下文
         * @return
         */
        int interpret(Map<String, Integer> context);

        // 用唯一的函数式接口方法定义计算过程。然后用若干个方法工厂生成各种闭包。闭包之间还可以通过接口串联起来

        /**
         * 算数
         * @param number 数字
         * @return 表达式
         */
        static Expr number(int number) {
            return context -> number;
        }

        /**
         * 加法
         * @param left 左操作数
         * @param right 右操作数
         * @return 表达式
         */
        static Expr plus(Expr left, Expr right) {
            return context -> left.interpret(context) + right.interpret(context);
        }

        /**
         * 减法
         * @param left 左操作数
         * @param right 右操作数
         * @return 表达式
         */
        static Expr minus(Expr left, Expr right) {
            return context -> left.interpret(context) - right.interpret(context);
        }

        /**
         * 变量
         * @param name 名称
         * @return 表达式
         */
        static Expr variable(String name) {
            return context -> context.getOrDefault(name, 0);
        }
    }
}
