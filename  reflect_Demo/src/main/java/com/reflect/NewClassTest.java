package com.reflect;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by a07 on 17/1/5.
 */
public class NewClassTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
        Constructor<File> c = File.class.getDeclaredConstructor(String.class);
        File file = c.newInstance("/Users/a07/test.txt");
        file.createNewFile();

    }
}
