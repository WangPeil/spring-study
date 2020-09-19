package com.example.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * @author peili.wang
 * @date 2020/3/5 22:34
 */
public class ProxyHandler implements InvocationHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProxyHandler.class);
    private Object object;

    public ProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Objects.requireNonNull(method);
        LOGGER.info("Java动态代理");
        return method.invoke(object, args);
    }

    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        ProxyHandler proxyHandler = new ProxyHandler(hello);
        Hello proxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(), proxyHandler);
        proxy.sayHello();
    }
}
