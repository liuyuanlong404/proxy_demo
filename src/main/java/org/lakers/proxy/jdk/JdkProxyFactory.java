package org.lakers.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * Created on 2023/2/24 14:05
 *
 * @author lakers
 */
public class JdkProxyFactory {

    public static <T> Object getProxy(Object target) {
        // 目标类的类加载器
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                // 代理需要实现的接口,可指定多个
                target.getClass().getInterfaces(),
                // 代理对象对应的自定义 InvocationHandler
                new DebugInvocationHandler(target));
    }
}
