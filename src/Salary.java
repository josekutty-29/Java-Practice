import tobin.Employee;
public class Salary {
public static void main(String[] args) {
	Employee emp1=new Employee("Chris",001,60000);
	Employee emp2=new Employee("Jansen",002,70000);
	emp1.printEmployeeDetails();
	emp1.calculateAnnualSalary();
	System.out.println("Bonus: "+emp1.calculateBonus());
	
	
	emp2.printEmployeeDetails();
	emp2.calculateAnnualSalary();
	System.out.println("Bonus: "+emp2.calculateBonus());
	
	
	
	
}
}
