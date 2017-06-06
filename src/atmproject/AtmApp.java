package atmproject;

import java.util.Scanner;

public class AtmApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Account acc= new Account();
		
		ATM atm = new ATM();

		
		System.out.println("Enter an account number: ");
		int newAcNum= sc.nextInt();
		acc.setAccountNumber(newAcNum);
		
		System.out.println("Enter a pin: ");
		int newPin = sc.nextInt();
		acc.setPin(newPin);
		
		System.out.println("Enter an account name: ");
		String newAcName=sc.nextLine();
		acc.setAccountName(newAcName);
		
		
		if (atm.isValidUser(newAcNum, newPin)){
		
		System.out.println("Enter a transaction option: ");
		
		  atm.deposit(newAcNum, newAcName);
		  atm.withdraw(newAcNum, newAcName);
		  acc.getBalance();
		}

		
		

	}

}
