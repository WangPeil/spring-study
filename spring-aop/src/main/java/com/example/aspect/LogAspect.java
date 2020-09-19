package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * 切面类 注意切面类是一个容器中的bean
 *
 * @author peili.wang
 * @date 2020/3/1 23:41
 */
@Aspect
public class LogAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    /**
     * 切点的定义
     */
    @Pointcut("execution(* com.example.service..*(..))")
    public void pointcut() {

    }

    /**
     * 前置通知定义
     */
    @Before("pointcut()")
    public void before() {
        LOGGER.info("aop注解日志前置通知");
    }

    /**
     * 后置通知定义
     */
    @After("pointcut()")
    public void after() {
        LOGGER.info("aop注解日志后置通知");
    }

    /**
     * 环绕通知定义
     *
     * @param point 目标对象
     * @return 返回目标对象执行结果
     * @throws Throwable 异常
     */
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Objects.requireNonNull(point, "代理对象不能为空");
        LOGGER.info("aop注解日志环绕通知前");
        Object result = point.proceed();
        LOGGER.info("aop注解日志环绕通知后");
        return result;
    }

    /**
     * 返回后置通知
     */
    @AfterReturning("pointcut()")
    public void afterReturning() {
        LOGGER.info("aop注解日志返回后置通知");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        LOGGER.info("aop注解日志异常后置通知");
    }
}
