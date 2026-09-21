package lambda;

public class AddMain {
public static void main(String[] args) {
//	Calculator c=new Calculator(){
//		public void add(int a,int b) {
//			System.out.println(a+b);
//		}
//		
//		
	//};
	
	Calculator c=(a,b)->{ System.out.println(a+b);};
	c.add(5, 5);
}

}
