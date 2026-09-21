package Exception;

public class Bike extends Vechicle {
	Bike(int a,String str,int b){
		super(a,str,b);
	}
	
	void calculateRent() {
		if(getRentalDays()<=0) {
			throw new ArithmeticException("Number of Rental Days Cannot be Zero or Negative");
		}
		else {
			System.out.println("RENT : "+(500)/getRentalDays());
		}
	}

}
