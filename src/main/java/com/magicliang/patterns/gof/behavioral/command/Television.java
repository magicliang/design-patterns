package com.magicliang.patterns.gof.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * project name: design-patterns
 * <p>
 * description: 电视类
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 17:58
 */
@Slf4j
public class Television implements CommandReceiver {

    @AllArgsConstructor
    @Getter
    private enum Channel {

        /**
         * CCTV
         */
        CCTV("CCTV"),

        /**
         * CNN
         */
        CNN("CNN"),
        ;

        /**
         * 频道名称
         */
        private String channelName;
    }

    /**
     * 打开电视
     */
    public void on() {
        log.info("tv on");
    }

    /**
     * 关闭电视
     */
    public void off() {
        log.info("tv off");
    }

    /**
     * 换台
     */
    public void nextChannel() {
        log.info("channel changed");
    }
}
