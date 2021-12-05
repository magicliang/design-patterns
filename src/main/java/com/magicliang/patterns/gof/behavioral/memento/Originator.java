package com.magicliang.patterns.gof.behavioral.memento;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * project name: design-patterns
 * <p>
 * description:
 * 创始人
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 19:10
 */
@Slf4j
@Getter
@Setter
@EqualsAndHashCode
public class Originator {

    /**
     * 状态
     */
    private String state;

    /**
     * 保存当前状态到备忘录
     *
     * @return 备忘录
     */
    public Memento<String> saveToMemento() {
        log.info("saveToMemoto:" + state);
        return new Memento<>(state);
    }

    /**
     * 从备忘录还原状态
     *
     * @param memento 备忘录
     */
    public void restoreFromMemento(Memento<String> memento) {
        state = memento.getState();
        log.info("restoreFromMememto:" + state);
    }


}
