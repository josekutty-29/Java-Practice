
public class Reverse {
	public static void main(String[] args) {
		int num=123;
		int rem;
		int num1=0;
		while(num!=0) {
			rem=num%10;
			num1=num1*10+rem;
			num=num/10;
			
		}
		System.out.println(num1);
	}

}
