package Exception;
import java.util.Scanner;
public class ShoppingMain {
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter customer Name");
			String a=sc.nextLine();
			
			System.out.println("Enter Order Amount");
			double b=sc.nextDouble();
			Shopping s=new Shopping(a,b);
			
			try {
				s.placeOrder();
			}
			catch(ArithmeticException e) {
				System.out.println("Minimum Order Amount is 500.Please order Again!!!!");																																
			}
			
			finally {
				System.out.println("Thankyou for Shopping With ABC Online Shopping");
				
			}
		}

	}
	 


