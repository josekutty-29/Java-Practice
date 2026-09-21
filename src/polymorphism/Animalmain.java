package polymorphism;

public class Animalmain {
  public static void main(String[] args) {
	  Animal aml;
	  aml=new Dog();
	  aml.sound();
	  aml.run();
	  Dog d=(Dog)aml;
	  d.eat();
	  aml=new Cat();
	  aml.sound();
	  
  }
}
