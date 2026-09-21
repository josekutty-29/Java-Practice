package Exception;

public class Shopping {

String cusName;	
double orderAmount ;
	
	
	Shopping(String a,double b){
		cusName=a;
		orderAmount=b;
		
		
	}
	void placeOrder() throws ArithmeticException  {
		
		if(orderAmount<500) {
			throw new ArithmeticException("Minimum Order Amount is 500");
		}
		
		else {
			
			System.out.println("Order Placed Succesfully");
		}
		
			
		
	}
}
