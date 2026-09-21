package Exception;

public class BalanceMain {
	public static void main(String[] args) {
		Balance b=new Balance(10000);
		try {
			b.withdraw(500000);
		}
		catch(ArithmeticException e) {
			System.out.println("Insufficient Balance");																																	
		}
	}

}
 