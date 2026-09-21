
public class Calculator {
	double num1;
	double num2;
	
	Calculator(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
	}
    
	void add() {
		System.out.println("Sum : "+(num1+num2));	
	}
	
	void subtract() {
		System.out.println("Differnce : "+(num1-num2));	
	}
	
	void multiply() {
		System.out.println("Product : "+(num1*num2));	
	}
	
	void division() {
		System.out.println("Division : "+(num1/num2));	
	}
}
