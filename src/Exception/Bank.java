package Exception;

class InvalidWithdrawException extends Exception{
	InvalidWithdrawException(String message){
		super(message);
	}
	
}

public class Bank {
	


int accountNumber;
int Pin;
double balance;

Bank(int accno,int pin,double balance){
	this.accountNumber=accno;
	this.Pin=pin;
	this.balance=balance;
}
void deposit(double amount) {
	balance+=amount;
	
}
void withdraw(double amount) throws InvalidWithdrawException  {
	
	if(balance<amount) {
		throw new InvalidWithdrawException("Not Sufficient Balance");
	}
	
	else {
		balance-=amount;
		System.out.println("Balance : "+balance);
	}
	
		
	
}

double printBalance() {
	return balance;

	
}

}



