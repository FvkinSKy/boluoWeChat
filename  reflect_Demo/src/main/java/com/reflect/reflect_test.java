package com.reflect;

import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * Created by a07 on 17/1/4.
 */
public class reflect_test {
    @SuppressWarnings("unchecked")
    @Test
    public void test() throws ClassNotFoundException {
        System.out.println("第一种方法" + Object.class.getClass());
        Class c1=new Date().getClass();
        System.out.println("第二种方法" +c1.getName());

        Class c2=boolean.class;
        System.out.println("第三种方法"+c2.getName());

        System.out.println(Class.forName("java.lang.String"));



    }
}
