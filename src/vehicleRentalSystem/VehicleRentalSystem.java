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
		 sc.nextLine();
		 
		 if(vehicleType.equalsIgnoreCase("Car")) {
			 System.out.println("Enter Number of Seats :");
			 int numberOfSeats=sc.nextInt();
			 sc.nextLine();
			 System.out.println("Enter Fuel Type :");
			 String fuelType=sc.nextLine();
			 
			 
			 vehicles.add(new Car(vehicleId,vehicleNumber,brand,model,rentalRate,numberOfSeats,fuelType));
		 }
		 
		 else {
			 
			 System.out.println("Enter the Engine Capacity :");
			 double engineCapacity=sc.nextDouble();
			 sc.nextLine();
			 System.out.println("Whether helmet avilable :");
			 String helmet=sc.nextLine();
			 vehicles.add(new Bike(vehicleId,vehicleNumber,brand,model,rentalRate,engineCapacity,helmet));
			 
		 }
		 System.out.println("Vehicles Added Successfully");
		 
		 
	 }
	 
	 
	 
	 
	 
	 public void displayVehicle() {
		 if(vehicles.isEmpty()) {
			 System.out.println("Currently No Vehicles are added");
		 }
		 for(Vehicle v:vehicles) {
			 v.printVehicleDetails();
			 System.out.println();
		 }
	 }
	 
	 
	 public void displayAvailableVehicle() {
		 
		 boolean foundVehicle=false;
		 if(vehicles.isEmpty()) {
			 System.out.println("Currently No Vehicles are added");
		 }
		 for(Vehicle v:vehicles) {
			 
			 if(v.getAvailability()) {
				 foundVehicle=true;
			       v.printVehicleDetails();
			       System.out.println();
		           }
			 
			 }
		 if(!foundVehicle) {
			 System.out.println("Currently No Vehicles are Available");
		 }
	 }
	 
	 
	 public void rentVehicle() {
		 
		 System.out.println("Enter Customer ID :");
		 String customerId=sc.nextLine();
		 System.out.println("Enter Customer Name :");
		 String customerName=sc.nextLine();
		 System.out.println("Enter Phone Number :");
		 long phoneNumber=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter Vehicle ID :");
		 String vehicleId=sc.nextLine();
		 System.out.println("Enter Number of Rental Days :");
		 int numberOfDays=sc.nextInt();
		 sc.nextLine();
		 
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
		 else { 	 
		if(!availability) {
			System.out.println("Vehicle is Already Rented");
			
		}
		else {
		if(numberOfDays<=0) {
			System.out.println("Number of Rental Days Must be Greater Than 0");
		}
		else {
			numOfDays=true;
		}
		 }
		 }
		
		if(idExists&availability&numOfDays) {
			Customer c=new Customer(customerId,customerName,phoneNumber);
			customers.add(c);
			String rentalId = "R" + (rentals.size() + 1);
			Rental r=new Rental(rentalId,c,foundVehicle,numberOfDays);
			foundVehicle.setAvailability(false);
			rentals.add(r);
			r.printRentalDetails();
		}
		
		 
		 
	 }
	 
	 
	 
	 public void returnVehicle() {
		 System.out.println("Enter Vehicle ID :");
		 String vehicleId=sc.nextLine();
		 
		  Rental foundRent=null;
		  boolean idExists=false;
		  boolean availability=false;
		  Vehicle foundVehicle=null;
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
		 if(availability) {
			 System.out.println("Vehicle is not Currently Rented!!!");
			 
		 }
		 else {
			 foundVehicle.setAvailability(true);
			 for(Rental r:rentals) {
				 if(r.vehicle==foundVehicle) {
					 foundRent=r;
					 
				 }
			 }
			 
			 foundRent.printRentalDetails();
			 
		 }
		 
		 
	 }
	 
	 
	 public void calculateRentalCost() {
		 
		 System.out.println("Enter Vehicle ID :");
		 String vehicleId=sc.nextLine();
		 System.out.println("Enter Number of Rental Days :");
		 int numberOfDays=sc.nextInt();
		 sc.nextLine();
		 
		 Vehicle foundVehicle=null;
		 for(Vehicle v:vehicles) {
			 if(v.getVehicleId().equals(vehicleId)) {
				 foundVehicle=v;
				 break;	 
			 }
			 
		 }
		 
		 System.out.println(" Vehicle :"+foundVehicle.getBrand()+" "+foundVehicle.getModel());
		 System.out.println("Rate Per Day :"+foundVehicle.getRentalRate());
		 System.out.println("Number of Days :"+numberOfDays);
		 System.out.println("Total Cost :"+foundVehicle.calculateRentalCost(numberOfDays));
		 
		 
	 }
	
	
	
	public static void main(String[] args) {
		
		VehicleRentalSystem vs=new VehicleRentalSystem();
		int c=0;
		do {
		displayMenu();
    	
		 c=sc.nextInt();
		 sc.nextLine();
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
		case 5:
		       vs.returnVehicle();
		       break;
		case 6:
			   vs.calculateRentalCost();
			   break;
		case 7:
	    	   System.out.println("Thank you for using Vehicle Rental Sysytem");
			   break;
	    default:
	    	System.out.println("invalid input!!!");
			
			
		}
		}while(c!=7);
		
	}

}
