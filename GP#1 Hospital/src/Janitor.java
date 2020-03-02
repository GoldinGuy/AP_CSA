public class Janitor extends Administrator {
	protected boolean sweeping;

	public Janitor(String empName, int empNumber, String dept, boolean sw) {
		super(empName, empNumber, dept);
		sweeping = sw;
	}

	public void setIsSweeping(boolean isS) {
		sweeping = isS;
	}

	public boolean getIsSweeping() {
		return sweeping;
	}

	public String toString() {
		return super.toString() + " , Is Sweeping?: " + sweeping;
	}

	public void sweep() {
		if (sweeping) {
			System.out.println(super.name + " is sweeping.");
		} else
			System.out.println(super.name + " is not sweeping.");
	}
}