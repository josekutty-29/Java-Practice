package EmployeePayroll;

public class FullTimeEmployee extends Employee {
	
	private double baseSalary;
	private double bonus;
	
	public double getBaseSalary() {
		return baseSalary;
		
	}
	
	public double getBonus() {
		return bonus;
		
	}
	
	FullTimeEmployee(String name,int empid,double baseSalary,double bonus){
		super(name,empid);
		this.baseSalary=baseSalary;
		this.bonus=bonus;
	}
	
	public double calaculateSalary() {
		double salary=baseSalary+bonus;
		return salary;
		
		
	}

}
