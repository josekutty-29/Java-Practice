package RIdeBooking;
import java.util.Scanner;

public class VehicleMain {
	
	public static void main(String[] args) {
		
		
		System.out.println("Choose vehicle Type: "
				+ "1.Car  "
				+ " 2.Auto ");
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		if(n==1) {
			Car c=new Car("KL350978","Rajeev");
			System.out.println("Enter the distance: ");
			double distance=sc.nextDouble();
			c.startRide(distance);
			double fare=c.calculateFare(distance);
			System.out.println("Total fare is :"+fare);
			System.out.println("Enter the payment Type: "
					+ "1.Upi  "
					+ " 2.Cash ");
			PaymentMethod payment;
			int m=sc.nextInt();
			
			if(m==1) {
				payment=new upiPayment();
			}
			else {
				payment=new CashPayment();
			}
			payment.pay(fare);
			
			
		}
		else {
			Auto a=new Auto("KL056789","John");
			System.out.println("Enter the distance: ");
			double distance=sc.nextDouble();
			a.startRide(distance);
			double fare=a.calculateFare(distance);
			System.out.println("Total Fare is :"+fare);
			
			System.out.println("Enter the payment Type: "
					+ "1.Upi  "
					+ " 2.Cash ");
			
			PaymentMethod payment;
			int m=sc.nextInt();
			
			if(m==1) {
				payment=new upiPayment();
			}
			else {
				payment=new CashPayment();
			}
			payment.pay(fare);
		}
		
		System.out.println("Jurney Finished......");
		sc.close();
	}

}
