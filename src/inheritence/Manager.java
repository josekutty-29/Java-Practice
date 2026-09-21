package inheritence;

public class Manager extends Employee {
	String department;
	int teamSize;
	
	
	Manager(String employeeName,String employeeId,double salary,String department,int teamSize){
		super(employeeName,employeeId,salary);
		this.department=department;
		this.teamSize=teamSize;
	}
	
	public String toString() {
		return "department: "  +department +
		        "TeamSize :"+teamSize;
		
	}
	public void printManager() {
		System.out.println("Name: "+employeeName+"|ID: "+employeeId+"|Salary: "+salary+"|Department: "+department+"|Team-Size: "+teamSize);
	}
	

}
