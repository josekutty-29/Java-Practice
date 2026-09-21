package Exception;

public class Balance {

	int balance;
	
	
	Balance(int a){
		balance=a;
		
		
	}
	void withdraw(int amount) throws ArithmeticException  {
		
		if(balance<amount) {
			throw new ArithmeticException("Not Sufficient Balance");
		}
		
		else {
			balance-=amount;
			System.out.println("Balance : "+balance);
		}
		
			
		
	}
}
