package com.dav.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class BankInterestAdvice {
	public Object interestAdvice(ProceedingJoinPoint pjp) throws Throwable {
		
		//pre-logic
		System.out.println("pre-logic in BankInterestAdivce class");
		Object[] args = pjp.getArgs();
		
		if((double)args[0] <= 50000) 
			args[1] = 2;
		else args[1]=3;
		
		//call the Business method or invoking the Buisness the method !
		Object retVal = pjp.proceed(args);
		
		//post logic
		System.out.println("After Executing the B.logic of SimpleInterest method");
		
		return retVal;
		

	}

}
