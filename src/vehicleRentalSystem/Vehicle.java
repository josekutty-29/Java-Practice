package vehicleRentalSystem;

public abstract class Vehicle {
	
	private String vehicleId;
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalRate;
	private boolean availability;
	
	Vehicle(String vehicleId, String vehicleNumber,String brand,String model,double rentalRate){
		this.vehicleId=vehicleId;
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.model=model;
		this.rentalRate=rentalRate;
		this.availability=true;
		
	}
	
	public String getVehicleId() {
		return vehicleId;
	}
	
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getRentalRate() {
		return rentalRate;
	}
	
	public boolean getAvailability() {
		return availability;
	}
	
	
	public void setAvailability(boolean flag) {
		this.availability=flag;
	}
	
	
	public void rentVehicle() {
		setAvailability(false);	
	}
	
	
	public void returnVehicle() {
		setAvailability(true);
		
	}
	
	public String getStatus() {

	    if(availability) {
	        return "Available";
	    }

	    return "Rented";
	}
  
	public void printVehicleDetails() {
		System.out.println("Vehicle Id: "+getVehicleId());
		System.out.println("Vehicle Number: "+getVehicleNumber());
		System.out.println("Brand: "+getBrand());
		System.out.println("Model: "+getModel());
		System.out.println("Rental Rate: "+getRentalRate());
		System.out.println("Status: "+getStatus());
				
	}
	
	public abstract double calculateRentalCost(int days);
	

}
