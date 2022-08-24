package com.lakers.demo.jdk.reflect;

import com.lakers.demo.jdk.util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created on 2022/8/23 15:17
 *
 * @author Lakers
 */
public class JDKProxy {

    public static <T> T getProxy(Class<T> interfaceClass) {
        InvocationHandler handler = new JDKInvocationHandler();
        ClassLoader classLoader = ClassLoaderUtils.getCurrentClassLoader();
        T result = (T) Proxy.newProxyInstance(classLoader, new Class[]{interfaceClass}, handler);
        return result;
    }
}
