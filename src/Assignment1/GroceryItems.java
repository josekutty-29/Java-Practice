package Assignment1;
import java.util.*;

public class GroceryItems {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name of the Customer");
		String name=sc.nextLine();
		
		System.out.println("Enter Number of items");
		int n=sc.nextInt();
		sc.nextLine();
		
		String[] itemnames=new String[n];
		int[] quantities=new int[n];
		double[] prices=new double[n];
		double[] totalprices=new double[n];
		double subtotal=0;
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Name of item"+(i+1));
			itemnames[i]=sc.nextLine();
			
			
			do {
			System.out.println("Enter the quantity of item"+(i+1));
			quantities[i]=sc.nextInt();
			sc.nextLine();
			
			if(quantities[i]<=0) {
				System.out.println("Invalid value:Quantily cannot be 0 or Negative");
			}
			
			
			
		}while(quantities[i]<0);
		

		
		do {
			System.out.println("Enter the price of item"+(i+1));
			prices[i]=sc.nextInt();
			sc.nextLine();
			
			if(prices[i]<=0) {
				System.out.println("Invalid input : price should not be 0 or negative");
			}
		}while(prices[i]<0);
		
		
		 totalprices[i]=quantities[i]*prices[i];
		 subtotal=subtotal+totalprices[i];
	
	}
		int discountRate;
		if(subtotal<1000) {
			discountRate=0;
			
		}
		else if(subtotal<5000){
			discountRate=5;
		}
		
		else if(subtotal<10000){
			discountRate=10;
		}
		else {
			discountRate=15;
		}
		
		
		double discount=subtotal*(discountRate/100.0);
		double discountAmount=subtotal-discount;
		double gst=discountAmount*(18.0/100.0);
		double finalTotal=discountAmount+gst;
		
		
		
		System.out.println("\n========================================");
		System.out.println("            GROCERY BILL");
		System.out.println("========================================");
		System.out.println("Customer Name: " + name);
		System.out.println("----------------------------------------");
		System.out.println("Item\t\tQty\tPrice\tTotal");
		System.out.println("----------------------------------------");

		for (int i = 0; i < n; i++) {
		    System.out.println(
		        itemnames[i] + "\t\t" +
		        quantities[i] + "\t" +
		        prices[i] + "\t" +
		        totalprices[i]
		    );
		}

		System.out.println("----------------------------------------");
		System.out.println("Subtotal: ₹" + subtotal);
		System.out.println("Discount (" + discountRate + "%): ₹" + discount);
		System.out.println("Amount After Discount: ₹" + discountAmount);
		System.out.println("GST (18%): ₹" + gst);
		System.out.println("----------------------------------------");
		System.out.println("Final Payable Amount: ₹" + finalTotal);
		System.out.println("========================================");
		System.out.println("Thank you for shopping!");
	
	

}
}
