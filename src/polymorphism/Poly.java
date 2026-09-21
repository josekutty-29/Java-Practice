package polymorphism;

public class Poly {
	
public void add (int a,int b) {
	System.out.println("Sum : "+(a+b));
	
}

public void add (int a,int b,int c) {
	System.out.println("Sum : "+(a+b+c));
	
}

public void add (int a,double b) {
	System.out.println("Sum : "+(a+b));
}

public void add (double a,int b) {
	System.out.println("Sum : "+(a+b));
	
}


}
