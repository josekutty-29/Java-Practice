package Exception;
import java.util.Scanner;

public class VehicleMain {
	
	public static void main(String[] args) {
		int k;
		Vechicle vk;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Please choose 1.Car  2.Bike");
		int a=sc.nextInt();
		
		
			System.out.println("Enter the Number of the Vehicle :");
			int carNum=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Name of the Vechicle :");
			String s=sc.nextLine();
			System.out.println("Enter the Number of Rental Days :");
			int rentNum=sc.nextInt();
			
			
			
		if(a==1) {
			 vk=new Car( carNum,s,rentNum);
		}
		
		else {
			 vk=new Bike( carNum,s,rentNum);
		}
			try {
				vk.calculateRent();
				}
				catch(ArithmeticException e){
					System.out.println("Number of Rent Days Cannot be Zero or Negative");
				}
				finally{
					System.out.println("Thank You for using XYZ vehicle Rentals");
					sc.close();
					
				}
		System.out.println("Do you want to countinue 1.yes  2.no");
		 k=sc.nextInt();
		
		}while(k!=2);
		}
		
	}


