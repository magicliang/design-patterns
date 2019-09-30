package com.magicliang.patterns.behavioral.memento;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * project name: design-patterns
 * <p>
 * description: 备忘录类型
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 19:14
 */
@Getter
@RequiredArgsConstructor
public class Memento<T> {

    /**
     * 状态
     */
    private final T state;
}
