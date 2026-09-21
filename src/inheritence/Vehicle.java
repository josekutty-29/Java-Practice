package inheritence;

public class Vehicle {
String name;
double price;
String color;

Vehicle(String name,double price,String color){
	this.name=name;
	this.price=price;
	this.color=color;
}

public void printName() {
	System.out.println("Vehicle Name : "+name);
}
}
