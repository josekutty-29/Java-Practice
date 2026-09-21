
public class Simple {
	public static void main(String[] args) {
		System.out.println("HELLO");
		byte age=30;
		System.out.println("AGE:"+age);
		char ch='a';
		System.out.println(ch);
		boolean value=true;
		System.out.println(value);
		float num= 8.098765f;		
		System.out.println(num);
		double num1=0.876543;
		System.out.println(num1);
		int a=5;
		int b=3    ;
		System.out.println("addiiton: "+(a+b));
		
		
		System.out.println(a & b);
		System.out.println(a | b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
		//without
		b=a+b;
		a=b-a;
		b=b-a    ;
		
		System.out.println(a);
		System.out.println(b);
		byte t=3;
	for(byte i=0;i<600;i++) {
		System.out.println(i +": "+t);
		
	}
		
	}
}
