package encapsulation;

public class BankAccount {
int accountNumber;
String accountHolderName;
private double balance;

BankAccount(int accno,String name,double balance){
	this.accountNumber=accno;
	this.accountHolderName=name;
	this.balance=balance;
}
void deposit(double amount) {
	balance+=amount;
	
}
void withdraw(double amount) {
	if(balance>=amount) {
		balance-=amount;
	}
	else {
		System.out.println("Not Sufficient Balance!!!!!");
	}
}
void checkBalance() {
	System.out.println("Balance= "+balance);
	
}

}
