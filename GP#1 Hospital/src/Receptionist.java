public class Receptionist extends Administrator {
	protected boolean answering;

	public Receptionist(String empName, int empNumber, String dept, boolean ans) {
		super(empName, empNumber, dept);
		answering = ans;
	}

	public void setIsAnswering(boolean isA) {
		answering = isA;
	}

	public boolean getIsAnswering() {
		return answering;
	}

	public String toString() {
		return super.toString() + " , Is Answering?: " + answering;
	}

	public void answer() {
		if (answering) {
			System.out.println("Hello, this is " + super.name + " from " + super.department);
		} else System.out.println(super.name + " is not answering.");
	}
}