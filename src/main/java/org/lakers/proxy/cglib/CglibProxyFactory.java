package org.lakers.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created on 2023/2/24 14:17
 *
 * @author lakers
 */
public class CglibProxyFactory {

    public static Object getProxy(Class<?> clazz){
        // 创建动态代理增强类
        Enhancer enhancer = new Enhancer();
        // 设置类加载器
        enhancer.setClassLoader(clazz.getClassLoader());
        // 设置被代理的类
        enhancer.setSuperclass(clazz);
        // 设置方法拦截器
        enhancer.setCallback(new DebugMethodInterceptor());
        // 创建代理类
        return enhancer.create();
    }
}
