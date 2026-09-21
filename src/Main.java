
public class Main {
public static void main(String[] args) {
	
	Students st=new Students("Tobin",49,"Java");
	Employee ep=new Employee("Chris",001,50000);
	Rectangle rc=new Rectangle(20,30);
	BankAccount ba=new BankAccount(100200,"Jansen Joy",8000);
	
	st.printStudentDetails();
	ep.printEmployeeDetails();
	rc.area();
	rc.perimeter();
	ba.deposit(1000);
	ba.printBalance();
	ba.withdraw(2000);
	ba.printBalance();
	ba.withdraw(10000);
	
	   
	
}
}
