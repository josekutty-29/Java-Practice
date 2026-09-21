package inheritence;
class Car1 extends Vehicle {
		double speed;
		double weight;
		double mileage;
		
		Car1(double speed,double weight,double mileage,String name,double price,String color ){
			super(name,price,color);
			this.speed=speed;
			this.weight=weight;
			this.mileage=mileage;
		}
		public void printspeed() {
			System.out.println("Speed of "+name+ " is "+speed);
		}

	}

