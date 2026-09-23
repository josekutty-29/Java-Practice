package vehicleRentalSystem;

public class Rental {
	String rentalId;
	Customer customer;
	Vehicle vehicle;
	int numberOfDays;
	double totalCost;
	
	public Rental(String rentalId, Customer customer, Vehicle vehicle, int numberOfDays) {
	    this.rentalId = rentalId;
	    this.customer = customer;
	    this.vehicle = vehicle;
	    this.numberOfDays = numberOfDays;
	    this.totalCost = vehicle.calculateRentalCost(numberOfDays);
	}
	
	public void printRentalDetails() {
	    System.out.println("Rental ID : " + rentalId);
	    System.out.println("Customer Name : " + customer.getCustomerName());
	    System.out.println("Vehicle ID : " + vehicle.getVehicleId());
	    System.out.println("Vehicle Number : " + vehicle.getVehicleNumber());
	    System.out.println("Brand : " + vehicle.getBrand());
	    System.out.println("Model : " + vehicle.getModel());
	    System.out.println("Rate per Day : " + vehicle.getRentalRate());
	    System.out.println("Rental Days : " + numberOfDays);
	    System.out.println("Total Cost : " + totalCost);
	    System.out.println("Status: "+vehicle.getStatus());
	}

}
