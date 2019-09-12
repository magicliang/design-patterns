package com.magicliang.patterns.creational.builder;

/**
 * project name: design-patterns
 * <p>
 * description: 人建造者
 *
 * @author magicliang
 * date: 2019-09-10 22:48
 */
public class Person {

    /**
     * 名称
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 私有构造函数
     */
    private Person() {
    }

    /**
     * 通过建造者生成人实例
     *
     * @param builder 建造者
     */
    public Person(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
    }

    /**
     * get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * 人建造者
     */
    public static class Builder {
        /**
         * 名称
         */
        private String name;

        /**
         * 年龄
         */
        private int age;

        /**
         * 构建方法
         *
         * @return 人实例
         */
        public Person build() {
            return new Person(this);
        }

        /**
         * set the value of the name
         * @param name the value of name
         * @return 建造者
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * set the value of the age
         *
         * @param age the value of age
         * @return 建造者
         */
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        /**
         * get the value of name
         *
         * @return the value of name
         */
        public String getName() {
            return name;
        }

        /**
         * get the value of age
         *
         * @return the value of age
         */
        public int getAge() {
            return age;
        }
    }
}