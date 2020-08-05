package com.dav.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dav.service.BankService;

public class AroundAdviceTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		BankService proxy = null;
		
		ctx=new ClassPathXmlApplicationContext("com/dav/cfgs/applicationContext.xml");

		//get proxy bean which is InMemory proxy object of target BankService Obj
		proxy = ctx.getBean("pfb",BankService.class);
		
		System.out.println("Simple Interest is ::  "+proxy.calcSimpleInterest(10000, 8, 12));
		System.out.println("..................................");
		System.out.println("Compound Interest is ::  "+proxy.calcCompundInterest(100000, 8, 12));
	}
}