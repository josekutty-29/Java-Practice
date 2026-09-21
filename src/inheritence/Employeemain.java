package inheritence;

public class Employeemain {
public static void main(String[] args) {
	Developer dev=new Developer("Jansen","001",35000,4,"Back-end");
	Manager mg=new Manager("Jacob","003",35000,"HR",10);
	System.out.println(mg.toString());
	
	dev.printDeveloper();
	mg.printManager();
	System.out.println(dev instanceof Developer);
	
}
}


   