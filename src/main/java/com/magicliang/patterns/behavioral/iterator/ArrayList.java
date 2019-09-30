package com.magicliang.patterns.behavioral.iterator;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * project name: design-patterns
 * <p>
 * description: 数组列表
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 10:47
 */
public class ArrayList<T> implements List<T> {

    /**
     * 实际当前的元素大小
     */
    private int size;

    /**
     * Shared empty array instance used for empty instances.
     */
    private static final Object[] EMPTY_ELEMENTDATA = {};

    /**
     * Shared empty array instance used for default sized empty instances. We
     * distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when
     * first element is added.
     */
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    /**
     * The array buffer into which the elements of the ArrayList are stored.
     * The capacity of the ArrayList is the length of this array buffer. Any
     * empty ArrayList with elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
     * will be expanded to DEFAULT_CAPACITY when the first element is added.
     */
    transient Object[] elementData; // non-private to simplify nested class access


    /**
     * 空构造器
     */
    public ArrayList() {
        this.size = 0;
        elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    /**
     * 初始化器
     *
     * @param capacity
     */
    public ArrayList(int capacity) {
        this.size = 0;
        if (capacity > 0) {
            elementData = new Object[capacity];
        } else if (capacity == 0) {
            elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    capacity);
        }
    }

    /**
     * 增加列表元素
     *
     * @param e 元素
     */
    @Override
    public void add(T e) {
        int targetSize = size + 1;
        if (targetSize > elementData.length) {
            douleGrow();
        }
        elementData[size++] = e;
    }

    /**
     * 增长
     */
    private void douleGrow() {
        // 默认2倍增长
        elementData = Arrays.copyOf(elementData, elementData.length * 2);
    }

    /**
     * 生成迭代器
     *
     * @return
     */
    @Override
    public Iterator<T> getIterator() {
        return new ArrayListIterator();
    }

    /**
     * 不能使用静态类，一定要用私有的、匿名的、平凡的内部类。
     * 全局已经出现一个 type parameter了，所以此处不必再声明，否则，继承时依然要声明类型参数。
     */
    private class ArrayListIterator implements Iterator<T> {

        /**
         * 当前的游标索引位置
         */
        private int cursor = 0;

        /**
         * get the value of currentIndex
         *
         * @return the value of currentIndex
         */
        public int getCursor() {
            return cursor;
        }

        /**
         * set the value of the currentIndex
         *
         * @param cursor the value of currentIndex
         */
        public void setCursor(int cursor) {
            this.cursor = cursor;
        }

        /**
         * 是否还有下一个元素
         *
         * @return 是否还有下一个元素
         */
        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        /**
         * 获取下一个元素
         *
         * @return 下一个元素
         */
        @Override
        public T next() {
            if (cursor >= size) {
                throw new NoSuchElementException();

            }
            // 数组虽然不能直接用泛型，但泛型可以用 T 强转型
            return (T) elementData[cursor++];
        }
    }
}
