
public class CollegeStudent extends Student{

	public String major;
	public int year;

	public CollegeStudent(String name, int age, String gender, String idNum,
			double gpa, int y, String maj) {
		super(name, age, gender, idNum, gpa);
		major = maj;
		year = y;
	}
	
	public String toString(){
		return super.toString() + ",major:" + major + ",year: " + year;
	}
	
	public int getYear(){
		return year;
	}
	
	public String getMajor(){
		return major;
	}
	
	public void setYear(int y){
		year = y;
	}
	
	public void setMajor(String interest){
		major = interest;
	}

}
