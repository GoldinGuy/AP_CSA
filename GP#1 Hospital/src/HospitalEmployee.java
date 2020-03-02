public class HospitalEmployee {

	protected String name;
	protected int number;

	// sets up this hospital employee with specified information

	public HospitalEmployee(String empName, int empNumber) {

		name = empName;
		number = empNumber;
	}

	// sets the name for this employee
	public void setName(String empName) {
		name = empName;
	}

	// sets the employees number
	public void setNumber(int empNumber) {
		number = empNumber;
	}

	// returns this employee's name
	public String getName() {
		return name;
	}

	// returns this employee's number
	public int getNumber() {
		return number;
	}

	// returns a description of this employee as a string
	public String toString() {
		return name + " Employee Number: " + number;
	}

	public void work() {
		System.out.println(name + " works for the hospital.");
	}

}
