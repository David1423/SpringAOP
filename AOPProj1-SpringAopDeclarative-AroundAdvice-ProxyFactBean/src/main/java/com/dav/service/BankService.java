package com.dav.service;

public class BankService {
	
	public float calcSimpleInterest(float price, float rate,int time) {
		System.out.println("BankService.calcSimpleInterest() - TARGET METHOD-1");
		
		float amount =0.0f;
		
		// simple interest = PTR/100
		amount = (price*time*rate)/100.0f;
		return amount;
	}
	
	public float calcCompundInterest(float price,float rate,int time) {
		System.out.println("BankService.calcCompundInterest()- TARGET METHOD-2");
		float amount = 0.0f;
		
		//p(1+r/100)^t
		
		amount = (float) ( price*(Math.pow((1+(rate/100)), time)));
		return amount;
	}
}
