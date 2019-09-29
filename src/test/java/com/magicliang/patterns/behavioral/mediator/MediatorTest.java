package com.magicliang.patterns.behavioral.mediator;

import org.testng.annotations.Test;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-29 15:13
 */
public class MediatorTest {

    @Test
    public void testOperation() {
        Mediator mediator = new ConcreteMediator();
        Member m1 = new ConcreteMember("1", mediator);
        Member m2 = new ConcreteMember("2", mediator);

        mediator.register(m1);
        mediator.register(m2);

        mediator.operation("1", "ab");
        mediator.operation("2", "cd");

    }
}