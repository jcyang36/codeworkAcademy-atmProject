package atmproject;

import numbers.NumberUtility;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM 
{
	Account acc= new Account();
	Scanner sc = new Scanner(System.in);
	
	private int[] PinList;
	private double accountBalance;
	private String userName;
	//private ArrayList<Integer>userOut;  
		

/*public static Integer saveAccNum(){
	
	return this.userOut.get(0);
}
	*/
	
	/*System.out.println("The user name is: "+acc.getAccountName());
	System.out.println("The balance is: "+acc.getBalance());
	System.out.println("The account number is: "+acc.getAccountNumber());
	System.out.println("The pin is: "+acc.getPin());*/
	
	/*public Integer[] getPinList() {
		return PinList;
	}
	public void setPinList(Integer[] pinList) {
		PinList = pinList;
	}

	public String pinCheck(Integer[] PinList, Integer pin){
		if (java.util.Arrays.asList(PinList).indexOf(pin)==-1){
			return "Enter transaction option";
		}
		else{
			return "Enter a pin";
		}
	}*/
	
	
	 //int[] Pinx_List= new int[3];
	// int[] Pins=new int[3];
	 Pin_List[0]=1234;
	 Pin_List[1]=4567;
	 Pin_List[2]=7890;
	 
	 String[] User_List=new String[3];
	 User_List[0]= "Annie";
	 User_List[1]="Bobby";
	 User_List[2]="Charles";
	 
	 int[] Number_List=new int[3];
	 Number_List[0]= "11111111";
	 Number_List[1]="22222222";
	 Number_List[2]="33333333";
	 
	 userOut = new ArrayList<Integer>();  
	 
	 int counter = 0 ; 
	public boolean isValidUser(int newAcNum,int newPin){
		
		
		
		for(int i=0; i<User_List.length; i++) {
			if (Pins[i]==newPin && Number_List[i]==newAcNum && counter <4){
				userOut.add(newAcNum);

				return true;
			}
			else{
				return false;
						counter ++;
			}
		}
	} //three times trial
	
	
	public double deposit(int newAcNum, String newAcName){
	System.out.println("How much do you wish to deposit? ");
	double inDeposit = sc.nextDouble();
	double newBalance= acc.getBalance() + inDeposit;
	acc.setBalance(newBalance);
		return (newBalance);
	}
	

	public Double withdraw(int newAcNum, String newAcName){
		System.out.println("How much do you wish to withdraw? ");
		Double inWithdraw = sc.nextDouble();
		Boolean validAmount= true;
		while(validAmount){
		if(inWithdraw < acc.getBalance())
		{
			newBalance= acc.getBalance() - inWithdraw;
			validAmount = false;
		}
		else {
			System.out.println("Withdraw amount should be less than the balance. ");
			System.out.println("How much do you wish to withdraw? ");
			inWithdraw = sc.nextDouble();
		}
	} 
		acc.setBalance(newBalance);
			return (newBalance);
		}
	
	
}




}