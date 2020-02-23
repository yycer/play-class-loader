package com.frankie.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Yao Frankie
 * @date: 2020/2/23 16:09
 */
@SpringBootTest
public class ClassLoaderTest {

    @Test
    void bootStrapPathTest(){
        String bootPath = System.getProperty("sun.boot.class.path");
        String extPath  = System.getProperty("java.ext.dirs");
        String classPath = System.getProperty("java.class.path");
        System.out.println(1);
    }
}
