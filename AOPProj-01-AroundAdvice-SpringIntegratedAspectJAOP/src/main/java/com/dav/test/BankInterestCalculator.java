package com.dav.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dav.bank.IBank;

public class BankInterestCalculator {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/dav/cfgs/applicationContext.xml");
		
		IBank proxy = ctx.getBean("bank", IBank.class);
		
		System.out.println(proxy.getClass()+" ....  "+proxy.getClass().getSuperclass()+" ....  "+Arrays.toString(proxy.getClass().getInterfaces()));
		
		System.out.println("Simple Interest :: "+ proxy.simpleInterest(500000, 5, 2));
		

	}

}
