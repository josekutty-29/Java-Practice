
 class Car {
	 
	 String name;
	 double price;
	 String color;
	 
	 
	 void move() {
		 System.out.println("moving");
	 }
	 void stop() {
		 System.out.println("stopping");
		 
	 }
	 void horn() {
		 System.out.println("horn!!!!");
		 
	 }

}
 
 public class Objects{
	 public static void main(String []args) {
		 Car maruthi=new Car();
		 maruthi.name="maruthi";
		 maruthi.color="Red";
		 maruthi.price=1200000;
		 System.out.println("The color of "+maruthi.name+" is "+maruthi.color);
		 maruthi.move();
		 maruthi.stop();
		 maruthi.horn();
		 System.out.println(maruthi);
		 
	 }
 }
 
