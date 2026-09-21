package polymorphism;

public class HospitalMain {
  public static void main(String[] args) {
	  HospitalStaff[] staff= { new Doctor(),new Nurse(),new Receptionist(),new Pharmacist()};
	  
	  for(HospitalStaff hs : staff) {
		  hs.performDuty();
	  }
  }
}
