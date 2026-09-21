package threads;
import java.util.*;

public class MyRunnable implements Runnable {
	
	public  void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		MyRunnable my=new MyRunnable();
		Thread t=new Thread(my);
		t.start();
		t.setName("joy");
		System.out.println(t.getName());
		t.setPriority(10);
		System.out.println(t.getPriority());
	       
		Thread t1=new Thread(my);
		t1.start();
		System.out.println(t1.getPriority());
		Thread t2=new Thread(my);
		
		t2.start();
		System.out.println(t2.getPriority());
		Thread t3=new Thread(my);
		
		t3.start();
		System.out.println(t3.getPriority());
		
		
		
		
	}

}
