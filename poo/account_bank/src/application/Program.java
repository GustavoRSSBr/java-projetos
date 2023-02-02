package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc1 = new Account(1000, "Gustavo", 1000.0);
		Account acc2 = new SavingsAccount(1001, "Carlos", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1002, "Maria", 1000.0, 500.0);
		
		acc1.withdraw(200.0);
		acc2.withdraw(200.0);
		acc3.withdraw(200.0);
		
		
		System.out.println("Conta Corrente : " + acc1.getBalance());
		System.out.println("Conta Poupança : " + acc2.getBalance());
		System.out.println("Conta Empresarial : " + acc3.getBalance());
	}

}
