package wildcards;
import java.util.*;

class Animals{
	String name;
	
	Animals(String name){
		this.name=name;
	}
	void eat(String name) {
		System.out.println("All Animals will Eat");
	}
	
	public String toString() {
		 return "Animal name ="+name;
	 }
}

class Dog extends Animals{

	Dog(String name){
		super(name);
	}
	void bark() {
		System.out.println("Dog"+ name+ "will bark like bow bow ");
	}
	
	public String toString() {
		 return "dog name ="+name;
	 }
}



class Cat extends Animals{
	String name;
	Cat(String name){
		super(name);
	}
	void meow() {
		System.out.println("Cat"+ name+ "will bark like meow meow");
	}
	 public String toString() {
		 return "cat name ="+name;
	 }
}



public class Wild {
	
	public static void displayAll(List<? extends Animals> al) {
		
		for(Object o : al) {
			System.out.println(o);
		}
		
		
	}
	
	
 public static void main(String args[]) {
	 //upper_Bound
	 List<Dog> dg=new ArrayList<>();
	 dg.add(new Dog("Toby"));
	 dg.add(new Dog("Tomy"));
	 dg.add(new Dog("Todo"));
	 
	 List<Cat> ct=new ArrayList<>();
	 ct.add(new Cat("Sony"));
	 ct.add(new Cat("Solly"));
	 ct.add(new Cat("Sammy"));
	displayAll(dg);
	System.out.println();
	displayAll(ct);
	
 }
}
