package vehicleRentalSystem;

public class Customer {
  String customerId;
  String customerName;
  long phoneNumber;
  
  Customer( String customerId,String customerName,long phoneNumber){
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
  
  public long getPhoneNumber() {
	  return phoneNumber;
  }
  
  public void setCustomerName(String name) {
	  customerId=name;
  }
  
  public void setPhoneNumber(long phone) {
	  phoneNumber=phone;
  }
  
  public void printCustomerDetails() {
	  System.out.println("Customer ID: "+customerId);
	  System.out.println("Customer Name: "+customerName);
	  System.out.println("Phone Number: "+phoneNumber);
		 
		 
	 }

		 
	 

  }
  

