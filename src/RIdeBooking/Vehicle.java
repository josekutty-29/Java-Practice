package RIdeBooking;

public abstract class Vehicle {
	private String vehicleNumber;
	private String driverName;
	Vehicle(String vehicleNumber,String driverName){
		this.vehicleNumber=vehicleNumber;
		this.driverName=driverName;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	
	public String getDriverName() {
		return driverName;
	}
	
	public void setVehicleNumber(String number) {
		vehicleNumber=number;
		
	}
	
	
	public void setDriverName(String name) {
		 driverName=name;
	}
	
	
	abstract void startRide(double distance);
	abstract double calculateFare(double distance);

}
