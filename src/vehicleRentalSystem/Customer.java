package vehicleRentalSystem;

public class Customer {
  String customerId;
  String customerName;
  int phoneNumber;
  
  Customer( String customerId,String customerName,int phoneNumber){
	  this.customerId=customerId;
	  this.customerName=customerName;
	  this.phoneNumber=phoneNumber;
  }
  
  public String getCustomerId() {
	  return customerId;
  }
  
  public String getCustomerName() {
	  return customerName;
  }
  
  public int getPhoneNumber() {
	  return phoneNumber;
  }
  
  public void getCustomerName(String name) {
	  customerId=name;
  }
  
  public void getPhoneNumber(int phone) {
	  phoneNumber=phone;
  }
  
  public void printCustomerDetails() {
	  System.out.println("Customer ID: "+customerId);
	  System.out.println("Customer Name: "+customerName);
	  System.out.println("Phone Number: "+phoneNumber);
		 
		 
	 }

		 
	 

  }
  

