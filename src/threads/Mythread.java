package threads;

public class Mythread extends Thread{
	 static Counter c;
	Mythread(Counter c){
		this.c=c;
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			c.increment();
		}
		//System.out.println(c.count);
		
		
	}
	
	public static void main(String[] args) throws Exception {
		Counter c1=new Counter();
		Mythread my=new Mythread(c1);
		my.start();
		
		Mythread my1=new Mythread(c1);
		my1.start();
		
		
		Mythread my2=new Mythread(c1);
		my2.start();
		

		Mythread my3=new Mythread(c1);
		my3.start();
		

		Mythread my4=new Mythread(c1);
		my4.start();
		my.join();
		my1.join();
		my2.join();
		my3.join();
		my4.join();
		
		
		System.out.println(c1.count);
		
		
		
		
		
	}
	

}
