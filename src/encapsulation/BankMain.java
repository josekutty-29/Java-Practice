package encapsulation;

public class BankMain {
	
	 public static void main(String args[]) {
		 
		 BankAccount bk=new BankAccount(121,"Jansen",5000);
		 bk.deposit(1000);
		 bk.checkBalance();
		 bk.withdraw(1);
		 bk.checkBalance();
		 bk.withdraw(10000);
		 
	 }

}
