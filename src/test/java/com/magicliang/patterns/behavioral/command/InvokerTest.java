package com.magicliang.patterns.behavioral.command;

import com.google.common.collect.Lists;
import org.testng.annotations.Test;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-27 19:28
 */
public class InvokerTest {

    @Test
    public void testInvoke() {
        Television television = new Television();

        // 注意，容器此处是无法协变的，大家都要按具体类型实参来
        Command<Television> onCommand = new OnCommand(television);
        Command<Television> offCommand = new OffCommand(television);
        Command<Television> nextChannelCommand = new NextChannelCommand(television);

        Invoker<Command<Television>> televisionInvoker = new TelevisionInvoker(Lists.newArrayList(onCommand, offCommand, nextChannelCommand));
        televisionInvoker.executeAll();
    }

}