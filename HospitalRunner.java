class HospitalRunner{

public static void main (String args []){


                     Doctor  doctor = new Doctor();
					 String doctorName="Dr.Harichandra";
  String qualificationOfDoctor="MBBS";
  doctor.doctorName=doctorName;
  doctor.qualificationOfDoctor=qualificationOfDoctor;


               Department department = new Department();
			   department.doctor=doctor;
                 boolean diagnosticServices=true;
				 department.diagnosticServices=diagnosticServices;
				 
				 
	Hospital	hospital		= new Hospital();
	hospital.department=department;
	 String hospitalName="AJ hospital";
		String hospitalAddress="Bondel";
		
		hospital.hospitalName=hospitalName;
		hospital.hospitalAddress=hospitalAddress;
		
		hospital.getHospitalInfo();

}





}