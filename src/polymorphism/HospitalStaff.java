package polymorphism;

 class HospitalStaff {

	    void performDuty() {
	        System.out.println("Hospital staff performs duty");
	    }
}


	class Doctor extends HospitalStaff {

	    @Override
	    void performDuty() {
	        System.out.println("Doctor diagnoses and treats patients");
	    }
	}


	class Nurse extends HospitalStaff {

	    @Override
	    void performDuty() {
	        System.out.println("Nurse takes care of patients");
	    }
	}


	class Receptionist extends HospitalStaff {

	    @Override
	    void performDuty() {
	        System.out.println("Receptionist manages appointments and patient records");
	    }
	}


	class Pharmacist extends HospitalStaff {

	    @Override
	    void performDuty() {
	        System.out.println("Pharmacist dispenses medicines");
	    }
	}


	
