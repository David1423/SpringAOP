package com.dav.service;

public interface IBankSecurity {
	public void withdraw(int accno, int amt);
	public void deposit(int accno, int amt);
}
