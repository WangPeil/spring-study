package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author peili.wang
 * @date 2020/3/1 23:41
 */
@Aspect
@Component
public class LogAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(* com.example.service..*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void before(JoinPoint point) {
        LOGGER.info("aop注解日志前置通知");
    }

    @After("pointcut()")
    public void after() {
        LOGGER.info("aop注解日志后置通知");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        LOGGER.info("aop注解日志环绕通知前");
        Object result = point.proceed();
        LOGGER.info("aop注解日志环绕通知后");
        return result;
    }

    @AfterReturning("pointcut()")
    public void afterReturning() {
        LOGGER.info("aop注解日志返回后置通知后");
    }
}
