package com.world.common.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * 操作日志，切面处理类
 *
 * @author Mark sunlightcs@gmail.com
 */
@Aspect
@Component
public class LogAspect {

	@Pointcut("@annotation(com.star.common.annotation.Log)")
	public void logPointCut() {
	}

	@Around("logPointCut()")
	public Object around(ProceedingJoinPoint point) {
//        long beginTime = System.currentTimeMillis();
//        try {
//            //执行方法
//            Object result = point.proceed();
//
//            //执行时长(毫秒)
//            long time = System.currentTimeMillis() - beginTime;
//            //保存日志
//            saveLog(point, time, OperationStatusEnum.SUCCESS.value());
//
//            return result;
//        }catch(Exception e) {
//            //执行时长(毫秒)
//            long time = System.currentTimeMillis() - beginTime;
//            //保存日志
//            saveLog(point, time, OperationStatusEnum.FAIL.value());
//
//            throw e;
//        }
		return null;
	}

	private void saveLog(ProceedingJoinPoint joinPoint, long time, Integer status) {
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        Method method = joinPoint.getTarget().getClass().getDeclaredMethod(signature.getName(), signature.getParameterTypes());
//        LogOperation annotation = method.getAnnotation(LogOperation.class);
//
//        SysLogOperationEntity log = new SysLogOperationEntity();
//        if(annotation != null){
//            //注解上的描述
//            log.setOperation(annotation.value());
//        }
//
//        //登录用户信息
//        UserDetail user = SecurityUser.getUser();
//        if(user != null){
//            log.setCreatorName(user.getUsername());
//        }
//
//        log.setStatus(status);
//        log.setRequestTime((int)time);
//
//        //请求相关信息
//        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
//        log.setIp(IpUtils.getIpAddr(request));
//        log.setUserAgent(request.getHeader(HttpHeaders.USER_AGENT));
//        log.setRequestUri(request.getRequestURI());
//        log.setRequestMethod(request.getMethod());
//
//        //请求参数
//        Object[] args = joinPoint.getArgs();
//        try{
//            String params = JSON.toJSONString(args[0]);
//            log.setRequestParams(params);
//        }catch (Exception e){
//
//        }
		//保存到DB
//        sysLogOperationService.save(log);
	}
}