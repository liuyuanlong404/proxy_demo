package com.lakers.demo.jdk.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Locale;

/**
 * Created on 2022/8/23 15:20
 *
 * @author Lakers
 */
public class JDKInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName());
        return method.invoke(proxy, "a");
    }
}
