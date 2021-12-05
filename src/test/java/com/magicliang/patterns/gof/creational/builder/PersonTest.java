package com.magicliang.patterns.gof.creational.builder;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * project name: design-patterns
 * <p>
 * description: 测试建造者
 *
 * @author magicliang
 * date: 2019-09-10 23:02
 */
public class PersonTest {

    @Test
    public void testPersonBuilder() {
        Person.Builder builder = new Person.Builder();
        int age = 10;
        String name = "abc";
        Person person = builder.setAge(age).setName(name).build();

        assertNotNull(person);
        assertEquals(age, person.getAge());
        assertEquals(name, person.getName());
    }

}