public class Surgeon extends Doctor {
	protected boolean operating;

	public Surgeon(String empName, int empNumber, String special, boolean isOper) {
		super(empName, empNumber, special);
		operating = isOper;
	}

	public void setIsOperating(boolean isOper) {
		operating = isOper;
	}

	public boolean getIsOperating() {
		return operating;
	}

	public String toString() {
		return super.toString() + " , Is Operating: " + operating;
	}

	public void operate() {
		if (operating == true){
			System.out.println(super.name + " is performing an operation.");
		} else System.out.println(super.name + " is not operating.");
	}
}
