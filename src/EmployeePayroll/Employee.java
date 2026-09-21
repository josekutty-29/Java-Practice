package EmployeePayroll;

public abstract class Employee {
	private String name;
	private int empid;
	//private double baseSalary;
	
	Employee(String name,int empid){
		this.name=name;
		this.empid=empid;
	}
	
	
	
	
	public String getName() {
		return name;
		
	}
	
	public int getEmpid() {
		return empid;
	}
	
	
	
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public void setEmpid(int id) {
		empid=id;
	}
	
	
	
	public abstract double calaculateSalary();

}
