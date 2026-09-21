package inheritence;
   
 public class Car{
	 public static void main(String[] args) {
		 Car1 c1=new Car1(60,100,40,"BMW",400000,"Blue");
		 Bike b1=new Bike(60,100,40,"Ducatti",400000,"Red");
		 c1.printName();
		 c1.printspeed();
		 b1.printName();
		 b1.printBike();
		 
	 }
 }
