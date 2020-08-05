package com.dav.service;

public class BankServiceImpl implements BankService {

	@Override
	public float calcSimpleInterest(float price, int time, float rate) {
		System.out.println("BankServiceImpl.calcSimpleInterest().Target method 1");
		return price*time*rate/100;
	}

	@Override
	public float calcCompoundInterest(float price, int time, float rate) {
		System.out.println("BankServiceImpl.calcCompoundInterest().Target method 2");
		return (float) ( price*(1+Math.pow((rate/100),time)));
	}

}
