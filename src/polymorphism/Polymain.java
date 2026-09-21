package polymorphism;

public class Polymain {
   public static void main(String[] args) {
	   Poly py=new Poly();
	   py.add(1, 20);
	   py.add(1, 20,1);
	   py.add(1, 20.5);
	   py.add(1.5,20);
	   
   }
   
   public static void main(int a,int b) {
	   Poly py=new Poly();   
	   py.add(1, 20);
	   py.add(1, 20,1);
	   py.add(1, 20.5);
	   py.add(1.5,20);
	   
   }
}
