package inheritence;

public class Bike extends Vehicle {
	double speed;
	double weight;
	double mileage;
	
	Bike(double speed,double weight,double mileage,String name,double price,String color ){
		super(name,price,color);
		this.speed=speed;
		this.weight=weight;
		this.mileage=mileage;
	}
	public void printBike() {
		System.out.println("Speed of "+name+" is "+speed);	
		}

}
