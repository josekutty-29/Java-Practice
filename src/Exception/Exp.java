package Exception;
import java.util.Scanner;

public class Exp {
	public static void main(String[] args) {
		
	
 int a=10;
 int b=0;
 int[] arr= {10,12};
 Scanner sc=new Scanner(System.in);
 try {
	 System.out.println(arr[1]);
 int result=a/b;
 System.out.println(result);
 }
 
 catch(ArithmeticException ex) {     
	 System.out.println(ex.getMessage());
	 System.out.println("Enter the Second Number again");
	 b=sc.nextInt();
	 int result=a/b;
	 System.out.println(result);
	 
	 
	 
 }
 
 catch(ArrayIndexOutOfBoundsException e) {
	 System.out.println(e.getMessage());
	 
 }
 
 finally {
	 System.out.println("Always Executes");
	 sc.close();
	 
 }
	
}
}