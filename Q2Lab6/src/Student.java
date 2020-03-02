public class Student {

	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private int grades[] = { 0, 0, 0 };

	public Student(String first, String last, Address home, Address school,
			int score1, int score2, int score3) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		grades[0] = score1;
		grades[1] = score2;
		grades[2] = score3;
	}

	public String toString() {
		String result;
		result = firstName + " " + lastName + " \n";
		result += "Home Address: \n" + homeAddress + "\n";
		result += "School Address: \n" + schoolAddress + "\n";
		result += "Test 1 Score: " + grades[0] + "\n";
		result += "Test 2 Score: " + grades[1] + "\n";
		result += "Test 3 Score: " + grades[2] + "\n";
		result += "Average Test Score: \n" + avg() + "\n";
		return result;
	}

	public int setTestScore(int number, int value) {
		grades[number] = value;
		return number;
	}

	public int getTestScore(int number) {
		return grades[number];
	}

	public double avg() {
		int result = (grades[0] + grades[1] + grades[2]) / grades.length;
		return result;

	}

}
