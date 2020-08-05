package com.dav.test;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dav.service.BankService;
import com.dav.service.BankServiceImpl;

public class AroundAdviceInterface {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		BankService service = null;
		System.out.println("MAIN METHOD");
		
		ApplicationContext ctx = null;
		
		ctx= new ClassPathXmlApplicationContext("com/dav/cfgs/applicationContext.xml");
		
		service = ctx.getBean("proxy",BankService.class);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Compound Interest  is :: "+service.calcCompoundInterest(10000, 12, 12.0f));
		System.out.println("------------------------------------------------------------------------\n\n");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Simple Interest is :: "+service.calcSimpleInterest(10000, 10, 10.2f));
		System.out.println("-----------------------------------------------------------");
	}

}
