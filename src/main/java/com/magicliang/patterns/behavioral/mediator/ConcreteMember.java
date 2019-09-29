package com.magicliang.patterns.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * project name: design-patterns
 * <p>
 * description: 具体成员
 *
 * @author magicliang
 * <p>
 * date: 2019-09-29 15:00
 */
@Data
@AllArgsConstructor
@Slf4j
public class ConcreteMember implements Member {

    /**
     * id
     */
    private String id;

    /**
     * 协调者
     */
    private Mediator mediator;

    /**
     * 接收消息
     *
     * @param msg 消息
     */
    @Override
    public void receiveMsg(String msg) {
        log.info(id + " receive: " + msg + " from " + mediator);
    }
}
