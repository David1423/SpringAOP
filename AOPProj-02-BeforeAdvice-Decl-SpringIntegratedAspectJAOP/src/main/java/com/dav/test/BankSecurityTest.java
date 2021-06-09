package com.dav.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dav.service.IBankSecurity;

public class BankSecurityTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/dav/cfgs/applicationContext.xml");
		 
		IBankSecurity bankSecurity = ctx.getBean("bank",IBankSecurity.class);
		
		bankSecurity.deposit(123,200000);
		bankSecurity.withdraw(123,50000);
		
		
		
		
	}

}
