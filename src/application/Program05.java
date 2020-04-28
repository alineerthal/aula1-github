package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program05 {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex Green", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		
		Account acc6 = new SavingsAccount(1008, "Aline", 1000.0, 0.01);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new BusinessAccount(1009, "Tamires", 1000.0, 500.0);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria Brown", 0.0, 500.00);
		
		// UPCASTING:
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING:
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; --> dá erro ao executar
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Updated!");
		}
		
		
	}

}
