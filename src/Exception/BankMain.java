package Exception;
import java.util.Scanner;

public class BankMain {
	
    public static void main(String[] args) {
    	double share;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Account Number: ");
    	int accountNumber=sc.nextInt();
    	System.out.println("Enter the PIN: ");
    	int pin=sc.nextInt();
    	System.out.println("Enter the Account Balance: ");
    	double balance=sc.nextDouble();
    	System.out.println("Enter the withdrawal Amount: ");
    	double money=sc.nextDouble();
    	Bank bk= new Bank(accountNumber,pin,balance);
    	try {
    	bk.withdraw(money);
         }
    	catch(InvalidWithdrawException e) {
    		System.out.println("insufficent balance !!!!"+e.getMessage());
    		return;
    		
    	}
    	finally {
    		System.out.println("Thank you for using ABC Bank ATM");
    		
    	}
    	while(true) {
    	System.out.println("Enter the Number of Family Members: ");
    	try {
    	int n=sc.nextInt();
    	  if(n==0) {
    		  throw new ArithmeticException("Cannot Divide By Zero");
    	  }
    	
    	 share=money/n;
    	 break;
    	}
    	catch(ArithmeticException e){
    		System.out.println("Error: Number of Family Members Cannot be Zero.");
    	}
    	}
    	
    	
    	System.out.println("Each Person Receieves :"+share);
    	System.out.println("Remaining Balance:"+bk.printBalance());
    	
    		 
    	
}
}
