package vehicleRentalSystem;

public class Bike extends Vehicle {
	double engineCapacity;
	String helmetAvailable;
	
	 Bike(String vehicleId, String vehicleNumber,String brand,String model,double rentalRate,double engineCapacity,String helmetAvailable){
		 super(vehicleId,vehicleNumber,brand,model,rentalRate);
		 this.engineCapacity=engineCapacity;
		 this.helmetAvailable=helmetAvailable;
	 }
	 
	 public double calculateRentalCost(int numberOfDays) {
		 return getRentalRate()*numberOfDays;
		 
	 }
	 
	 public void printVehicleDetails() {
		 System.out.println("Vehicle Type :  Bike");
		 super.printVehicleDetails();
		 System.out.println("Engine Capacity: "+engineCapacity);
		 System.out.println("Helmet Avilablity : "+helmetAvailable);
		 
	 }

}
