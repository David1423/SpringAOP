package com.dav.bank;

public class BankServiceimpl implements IBank  {
	
	@Override
	public double simpleInterest(double principle, double rate,double time) {
		return principle*time*rate/100;
	}
}
