package Exception;

public class Car extends Vechicle {
	Car(int a,String str,int b){
		super(a,str,b);
	}
	
	void calculateRent() {
		if(getRentalDays()<=0) {
			throw new ArithmeticException("Number of Rental Days Cannot be Zero or Negative");
		}
		else {
			System.out.println("RENT : "+(1500)/getRentalDays());
		}
	}

}
