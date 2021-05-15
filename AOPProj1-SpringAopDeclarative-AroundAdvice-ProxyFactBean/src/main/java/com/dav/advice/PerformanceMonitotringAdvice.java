package com.dav.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitotringAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Object retValue = null;
		
		long start = System.currentTimeMillis();//pre-logic
		
		// invoke the B.method
		retValue=invocation.proceed();
		
		System.out.println("Class name:: "+invocation.getClass().getName());
		
		
		long end = System.currentTimeMillis();//post logic
		
		System.out.println("Time for execution is :: "+ (end-start)+" Milli seconds");
		
		return retValue;
		
	}
}
