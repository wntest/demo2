package com.wn.demo2.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BlogPropertiesTest {

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void getHello() {
        Assert.assertEquals(blogProperties.getName(),  "程序员");
        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot教程");
    }
}