package RIdeBooking;

public class CashPayment implements PaymentMethod{
	
	public void pay(double amount){
		System.out.println("Total Fare using Cash: "+(amount));
		
		
	}


}
