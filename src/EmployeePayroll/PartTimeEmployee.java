package EmployeePayroll;

public class PartTimeEmployee extends Employee {
	private double hourlyRate;
	private double hoursWorked;
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	
	
	PartTimeEmployee(String name,int empid,double rate,double hours){
		super(name,empid);
		this.hourlyRate=rate;
		this.hoursWorked=hours;
	}
	public double calaculateSalary() {
		return hourlyRate * hoursWorked;
		
		
		
	}

}
