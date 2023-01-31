package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1000, "Gustavo", 0.0);
		BusinessAccount bacc = new BusinessAccount(1001, "Empório Nordestino", 0.0, 1000.0);
		
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Gus", 10.0, 500.0);
		Account acc3 = new SavingsAccount(1004, "Maria", 0.0, 0.02);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		//System.out.println(acc1.getBalance()); 
	}

}
