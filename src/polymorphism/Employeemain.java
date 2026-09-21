package polymorphism;

public class Employeemain {
	
	public static void main(String[] args) {
		Employee emp;
		emp=new Developer();
		emp.work();
		
		emp=new Tester();
		emp.work();
		
		emp=new Manager();
		emp.work();
	}

}
