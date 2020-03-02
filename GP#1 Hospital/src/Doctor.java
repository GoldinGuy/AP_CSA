
public class Doctor extends HospitalEmployee{

	protected String specialty;
	public Doctor(String empName, int empNumber, String special) {
		super(empName, empNumber);
		specialty = special;
		
	}
public void setSpecialty (String special){
	specialty = special;
}
public String getSpecialty(){
	return specialty;
}
public String toString(){
	return super.toString() + ", Specialty: " + specialty;
}
	
public void diagnose(){
	System.out.println("Doctor " + super.name + " diagnoses the patient.");
}

}
