package Exception;

public abstract class Vechicle {
	
	private  int vehicleNumber;
	private String customerName;
	private int rentalDays;
	
     Vechicle(int a,String str,int b){
    	
    	vehicleNumber=a;
    	customerName=str;
    	rentalDays=b;
    	
    	}
    
   void setvehicleNumber(int num) {
	   vehicleNumber=num;
   }
   
   void setName(String name) {
	   customerName=name;
   }
   
   void setRentalDays(int num) {
	   rentalDays=num;
   }
   
   int getRentalDays() {
	   return rentalDays;
   }
   
   abstract void calculateRent(); 
	   
   
   
}
