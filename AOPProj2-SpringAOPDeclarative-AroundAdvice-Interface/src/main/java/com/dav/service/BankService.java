package com.dav.service;

public interface BankService {
	
	public float calcSimpleInterest(float price, int time, float rate);
	public float calcCompoundInterest(float price, int time, float rate);

}
