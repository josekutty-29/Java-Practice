package EmployeePayroll;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		int y;
		Employee[] emp=new Employee[1];
		do {
		System.out.println("Choose Employee Type");
		System.out.println("1.Full-Time Employee");
		System.out.println("2.Part-Time Employee");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		
		
		
		if(a==1) {
			System.out.println("Enter Employee Name");
			   String name = sc.nextLine();
			   
			System.out.println("Enter Employee ID");
			   int id=sc.nextInt();
			   
			System.out.println("Enter Base Salary");
			   double baseSalary=sc.nextDouble();
			System.out.println("Enter Bonus");
			   double bonus=sc.nextDouble();
			   
			System.out.println("Employee Details............");
			
			 emp[0]=new FullTimeEmployee(name,id,baseSalary,bonus);
			 
			 System.out.println(" Employee Name :"+emp[0].getName());
			 System.out.println(" Employee ID :"+emp[0].getEmpid());
			 FullTimeEmployee ft=(FullTimeEmployee)emp[0];
			 System.out.println(" Employee Base Salary :"+ft.getBaseSalary());
			 System.out.println(" Bonus :"+ft.getBonus());
			 
			
			}
		else {
			
			System.out.println("Enter Employee Name");
			   String name = sc.nextLine();
			   
			System.out.println("Enter Employee ID");
			   int id=sc.nextInt();
			   
			System.out.println("Enter Hourly Rate");
			   double hourlyRate=sc.nextDouble();
			System.out.println("Enter Working Hours");
			   double hours=sc.nextDouble();
			   
			System.out.println("Employee Details............");
			
			 emp[0]=new PartTimeEmployee(name,id,hourlyRate,hours);
			 
			 System.out.println(" Employee Name :"+emp[0].getName());
			 System.out.println(" Employee ID :"+emp[0].getEmpid());
			 PartTimeEmployee pt=(PartTimeEmployee)emp[0];
			 System.out.println(" Employee Hourly Working Rate :"+pt.getHourlyRate());
			 System.out.println(" Employee Working Hours:"+pt.getHoursWorked());
			
			
		}
		
		System.out.println(" Total Salary :"+emp[0].calaculateSalary());
		
		System.out.println("Do you want to continue: 1.yes  2.no,exit");
		   y=sc.nextInt();
		
		}while(y!=2);
		
		System.out.println("Payroll Completed!!!!!!!!!");
		
	}

}
