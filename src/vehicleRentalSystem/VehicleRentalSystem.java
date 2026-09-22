package vehicleRentalSystem;
import java.util.*;
public class VehicleRentalSystem {
	
	static Scanner sc=new Scanner(System.in);
	ArrayList<Vehicle> vehicles=new ArrayList<>();
	ArrayList<Rental> rentals=new ArrayList<>();
	ArrayList<Customer> customers=new ArrayList<>();

	 public static  void displayMenu() {
		System.out.println("========================================");
		System.out.println("       VEHICLE RENTAL SYSTEM");
		System.out.println("========================================");
		System.out.println("1. Add Vehicle");
		System.out.println("2. Display All Vehicles");
		System.out.println("3. Display Available Vehicles");
		System.out.println("4. Rent Vehicle");
		System.out.println("5. Return Vehicle");
		System.out.println("6. Calculate Rental Cost");
		System.out.println("7. Exit");
		System.out.print("Enter your choice: ");
	}
	
	 
	 public void addVehicle() {
		 System.out.println("Enter Vehicle Type :");
		 String vehicleType=sc.nextLine();
		 System.out.println("Enter Vehicle ID :");
		 String vehicleId=sc.nextLine();
		 System.out.println("Enter Vehicle Number :");
		 String vehicleNumber=sc.nextLine();
		 System.out.println("Enter Brand :");
		 String brand=sc.nextLine();
		 System.out.println("Enter Model :");
		 String model=sc.nextLine();
		 System.out.println("Enter Rental Rate per Day :");
		 Double rentalRate=sc.nextDouble();
		 
		 if(vehicleType.equalsIgnoreCase("Car")) {
			 System.out.println("Enter Number of Seats :");
			 int numberOfSeats=sc.nextInt();
			 System.out.println("Enter Fuel Type :");
			 String fuelType=sc.nextLine();
			 
			 
			 vehicles.add(new Car(vehicleId,vehicleNumber,brand,model,rentalRate,numberOfSeats,fuelType));
		 }
		 
		 else {
			 
			 System.out.println("Enter the Engine Capacity :");
			 double engineCapacity=sc.nextDouble();
			 System.out.println("Whether helmet avilable :");
			 String helmet=sc.nextLine();
			 vehicles.add(new Bike(vehicleId,vehicleNumber,brand,model,rentalRate,engineCapacity,helmet));
			 
		 }
		 System.out.println("Vehicles Added Successfully");
		 
		 
	 }
	 
	 
	 
	 
	 
	 public void displayVehicle() {
		 for(Vehicle v:vehicles) {
			 v.printVehicleDetails();
		 }
	 }
	 
	 
	 public void displayAvailableVehicle() {
		 for(Vehicle v:vehicles) {
			 
			 if(v.getAvailability()) {
			       v.printVehicleDetails();
		           }
			 }
	 }
	 
	 
	 public void rentVehicle() {
		 
		 System.out.println("Enter Customer ID :");
		 String customerId=sc.nextLine();
		 System.out.println("Enter Customer Name :");
		 String customerName=sc.nextLine();
		 System.out.println("Enter Phone Number :");
		 int phoneNumber=sc.nextInt();
		 System.out.println("Enter Vehicle ID :");
		 String vehicleId=sc.nextLine();
		 System.out.println("Enter Number of Rentsl Days :");
		 int numberOfDays=sc.nextInt();
		 
		 Vehicle foundVehicle=null;
		 boolean numOfDays=false;
		 boolean availability=false;
		 boolean idExists=false;
		 for(Vehicle v:vehicles) {
			 if(v.getVehicleId().equals(vehicleId)) {
				 idExists=true;
				 availability= v.getAvailability();
				 foundVehicle=v;
				 break;	 
			 }
			 
		 }
		 if(!idExists) {
			 System.out.println("Vehicle is Not Found");
			 
		 }
		 	 
		if(!availability) {
			System.out.println("Vehicle is Already Rented");
			
		}
		
		if(numberOfDays<=0) {
			System.out.println("Number of Rental Days Must be Greater Than 0");
		}
		else {
			numOfDays=true;
		}
		
		if(idExists&availability&numOfDays) {
			Customer c=new Customer(customerId,customerName,phoneNumber);
			customers.add(c);
			String rentalId = "R" + (rentals.size() + 1);
			Rental r=new Rental(rentalId,c,foundVehicle,numberOfDays);
			rentals.add(r);
		}
		 
		 
	 }
	
	
	
	public static void main(String[] args) {
		
		VehicleRentalSystem vs=new VehicleRentalSystem();
		
		
		displayMenu();
		int c=sc.nextInt();
		switch(c) {
		case 1:
			vs.addVehicle();
			break;
		case 2:
			vs.displayVehicle();
			break;
		case 3:
			vs.displayAvailableVehicle();
			break;
		case 4:
			vs.rentVehicle();
			break;
			
			
		}
		
	}

}
