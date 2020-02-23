package com.frankie.demo;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;
import org.springframework.boot.test.context.SpringBootTest;
import sun.misc.Launcher;

/**
 * @author: Yao Frankie
 * @date: 2020/2/23 16:09
 */
@SpringBootTest
public class ClassLoaderTest {

    @Test
    void threePathTest(){
        String bootPath = System.getProperty("sun.boot.class.path");
        String extPath  = System.getProperty("java.ext.dirs");
        String classPath = System.getProperty("java.class.path");
        System.out.println(1);
    }

    @Test
    void classLoaderTest(){
        ClassLoader cl = com.frankie.demo.Test.class.getClassLoader();
//        System.out.println(cl); // sun.misc.Launcher$AppClassLoader@b4aac2
        System.out.println(cl.getParent()); // sun.misc.Launcher$ExtClassLoader@18e2867
        System.out.println(cl.getParent().getParent()); // null

//        ClassLoader intCl = int.class.getClassLoader();
//        System.out.println(intCl); // null
    }
}
