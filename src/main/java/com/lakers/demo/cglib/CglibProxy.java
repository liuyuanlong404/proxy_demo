package com.lakers.demo.cglib;

import org.assertj.core.internal.cglib.proxy.Enhancer;
import org.assertj.core.internal.cglib.proxy.MethodInterceptor;
import org.assertj.core.internal.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created on 2022/8/23 15:17
 *
 * @author Lakers
 */
public class CglibProxy implements MethodInterceptor {

    public Object newInstall(Object object) {
        return Enhancer.create(object.getClass(), this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我被CglibProxy代理了");
        return methodProxy.invokeSuper(o, objects);
    }

}
