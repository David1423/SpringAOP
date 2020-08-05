package com.dav.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoringAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invoke) throws Throwable {
		// TODO Auto-generated method stub
		
		Object retVal = null;
		
		System.out.println("before the target method");
		retVal = invoke.proceed();
		System.out.println("after the target method");
		
		return retVal;
	}

}
