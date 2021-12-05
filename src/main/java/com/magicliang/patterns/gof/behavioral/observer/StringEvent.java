package com.magicliang.patterns.gof.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * project name: design-patterns
 * <p>
 * description: 字符串事件
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 23:55
 */
@Data
@AllArgsConstructor
public class StringEvent implements Event {

    /**
     * 状态
     */
    private String State;
}
