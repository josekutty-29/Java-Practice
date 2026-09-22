package vehicleRentalSystem;

public class Car extends Vehicle {
	int numberOfSeats;
	String fuelType;
	 Car(String vehicleId, String vehicleNumber,String brand,String model,double rentalRate,int numberOfSeats,String fuelType){
		 super(vehicleId,vehicleNumber,brand,model,rentalRate);
		 this.numberOfSeats=numberOfSeats;
		 this.fuelType=fuelType;
	 }
	 
	 public double calculateRentalCost(int numberOfDays) {
		 return getRentalRate()*numberOfDays;
		 
	 }
	 
	 public void printVehicleDetails() {
		 System.out.println("Vehicle Type :  Car");
		 printVehicleDetails();
		 System.out.println("Number of Seats: "+numberOfSeats);
		 System.out.println("Fuel Type: "+fuelType);
		 
	 }

}
