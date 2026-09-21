package threads;

public class Thread_Basics extends Thread {
	
	public void run() {
		System.out.println("Thread is Running");
	}
  public static void main(String[] args) {
	  Thread t= Thread.currentThread();
	  System.out.println(t.getName());
	  Thread_Basics tb=new Thread_Basics();
	  tb.start();
  }
}
