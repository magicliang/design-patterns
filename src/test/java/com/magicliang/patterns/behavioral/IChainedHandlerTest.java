package com.magicliang.patterns.behavioral;

import com.google.common.collect.Maps;
import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 17:15
 */
public class IChainedHandlerTest {

    @Test
    public void testHandle() {
        ConcreteChainedPrintHandler h1 = new ConcreteChainedPrintHandler();
        ConcreteChainedToJsonHandler h2 = new ConcreteChainedToJsonHandler();
        h1.setSuccessor(h2);

        HashMap<String, String> request = Maps.newHashMap();

        request.put("1", "2");

        h1.handle(request);
    }
}