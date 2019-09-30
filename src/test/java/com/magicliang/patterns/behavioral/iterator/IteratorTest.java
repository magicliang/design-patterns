package com.magicliang.patterns.behavioral.iterator;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 11:46
 */
@Slf4j
public class IteratorTest {


    @Test
    public void testIterator() {
        List<Integer> list = new ArrayList<>(3);

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.getIterator();
        while (iterator.hasNext()) {
            log.info(iterator.next().toString());
        }
    }
}