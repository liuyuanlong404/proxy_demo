package com.lakers.demo.jdk.util;

import sun.reflect.Reflection;

/**
 * Created on 2022/8/23 16:16
 *
 * @author Lakers
 */
public class ClassLoaderUtils {


    public static ClassLoader getCurrentClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }
}
