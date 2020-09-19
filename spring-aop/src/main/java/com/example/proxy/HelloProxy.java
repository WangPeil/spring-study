package com.example.proxy;

/**
 * @author peili.wang
 * @date 2020/3/6 14:54
 */
public class HelloProxy implements Hello {
    private Hello hello;

    public HelloProxy(Hello hello) {
        this.hello = hello;
    }

    @Override
    public void sayHello() {
        hello.sayHello();
    }
}
