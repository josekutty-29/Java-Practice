package Exception;

class InsufficientBalanceException  extends Exception{
	
	InsufficientBalanceException(String messege){
		super(messege);
	}
	
}
public class AbcBank {
int accountNumber;
String customerName;
private double balance;



AbcBank(int a,String b,double c){
	accountNumber=a;
	customerName=b;
	balance=c;
	
}

void withdraw(int amount) throws InsufficientBalanceException  {
	if(balance-amount<5000) {
		throw new InsufficientBalanceException("Not sufficient minimum Balance");
	}
	else {
		balance-=amount;
		System.out.println("withdraw sucessfully");
		System.out.println("Balance :"+balance);
	}
}
}
