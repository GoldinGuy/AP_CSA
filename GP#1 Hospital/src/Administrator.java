public class Administrator extends HospitalEmployee {
	protected String department;

	public Administrator(String empName, int empNumber, String dept) {
		super(empName, empNumber);
		department = dept;
	}

	public void setDepartment(String dept) {
		department = dept;
	}

	public String getDepartment() {
		return department;
	}

	public String toString() {
		return super.toString() + " , Department: " + department;
	}


	public void administrate() {
		System.out.println(super.name + "is the administrator for " + department);
	}
}
