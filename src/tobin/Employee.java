package tobin;

public class Employee {
	String employeename;
	int employeeid;
	double salary;
	public Employee(String name,int id,double salary){
		this.employeename=name;
		this.employeeid=id;
		this.salary=salary;
	}
	
	public void printEmployeeDetails() {
		System.out.println("Employee Name: "+employeename+"|"+"Employee ID: "+employeeid+" | Salary : "+salary);
	}
   public void calculateAnnualSalary() {
	   double annualSalary=salary*12+(calculateBonus());
	   System.out.println("Annual Salary : "+annualSalary);	   
   }
   
   public double calculateBonus() {
	   return (salary*0.1);
	   
   }
}
