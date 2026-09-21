package RIdeBooking;

public class upiPayment  implements PaymentMethod {
	
	public void pay(double amount){
		System.out.println("Total Fare using UPI: "+(amount+10.8));
		
		
	}

}
