package Exception;
    

public class AbcBankMain {
 public static void main(String[] args) {
	AbcBank bk=new AbcBank(12345566,"Diya",8000);
	
	try {
		bk.withdraw(5000);
	}
	catch(InsufficientBalanceException e) {
		System.out.println(e.getMessage());
	}
	
 }
}
 