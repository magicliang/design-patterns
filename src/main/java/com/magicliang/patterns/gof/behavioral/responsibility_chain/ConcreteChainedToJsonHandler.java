package com.magicliang.patterns.gof.behavioral.responsibility_chain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * project name: design-patterns
 * <p>
 * description: 具体的处理类
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 15:11
 */
@Slf4j
public class ConcreteChainedToJsonHandler extends AbstractChainedHandler<Object> {

    /**
     * 真处理逻辑
     *
     * @param o 请求
     */
    @Override
    protected void realHandle(Object o) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            String jsonString = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(o);
            log.info(jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
