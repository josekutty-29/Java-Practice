package inheritence;

public class Developer extends Employee {
int experience;
String role;



Developer(String employeeName,String employeeId,double salary,int experience,String role){
	super(employeeName,employeeId,salary);
	this.experience=experience;
	this.role=role;
}

public void printDeveloper() {
	System.out.println("Name: "+employeeName+"|ID: "+employeeId+"|Salary: "+salary+"|Experience in Years: "+experience+"|Role: "+role);
}




}
