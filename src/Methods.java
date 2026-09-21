 public class Methods {
	 static int add(int a ,int b) {
		return a+b;
		
	}
	static int printSum1(int a,int b) {
		int c = a + b;
		return c;
	}

	 static int printSum(int a,int b) {
		 int c = a + b;
		 System.out.println("hi");
		 return c;
	 }
	 

	public static  void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(add(a,b));
		System.out.println(printSum(a,b));
		System.out.println(printSum1(a,b));
	}
}
