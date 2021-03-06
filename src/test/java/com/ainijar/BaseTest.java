package com.ainijar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author slt
 * @date 2018/8/31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml", "classpath:spring/spring-mvc.xml"})
@WebAppConfiguration
public class BaseTest {
    @Autowired
    HelloWorld helloWorld;

    @Test
    public void test1() {
        helloWorld.say("hello world");
    }

}
