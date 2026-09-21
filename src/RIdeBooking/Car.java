package RIdeBooking;

public class Car extends Vehicle{
	
	Car(String vehicleNumber,String driverName){
		super(vehicleNumber,driverName);
		
	}
	public void startRide(double distance) {
		System.out.println("Vehicle Number : "+getVehicleNumber());
		System.out.println("Driver Name : "+getDriverName());
		System.out.println("Distance : "+distance);
		
		
		
	}
	
	public double calculateFare(double distance) {
		return distance*50;
		
		
	}

}
