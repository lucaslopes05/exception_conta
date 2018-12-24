 package model.entities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holter;
	private double balance;
	private double withdrawLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holter, double balance, double withdrawLimit) {
		super();
		this.number = number;
		this.holter = holter;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolter() {
		return holter;
	}

	public void setHolter(String holter) {
		this.holter = holter;
	}

	public double getBalance() {
		return balance;
	}


	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		
		if(amount > 0) {
			this.balance += amount;
		}	
	}
	
	public void withdraw(double amount) throws DomainException {
		if(amount > this.balance) {
			throw new DomainException("Not enough balance");
		}else if (amount > withdrawLimit){
			throw new DomainException("The amount exceeds withdraw limit");
		}else if(amount<0) {
			System.out.println("Valor incorreto");
		}
		
		this.balance -= amount;
	}
	
//	Um saque nao pode ocorrer ou se nao houver saldo na conta, ou se o valor do saque for superior ao linite de saque da conta. 
	
//	problemas 
//	nao pode fazer saque supeior ao do limite 
//	saldo insuficinte 
	
	

}
