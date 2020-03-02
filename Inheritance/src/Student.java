
public class Student extends Person {
	
	public String myIdNum;
	public double myGPA;

	public Student(String name, int age, String gender, String idNum, double gpa) {
		
		super(name, age, gender);
		myIdNum = idNum;
		myGPA = gpa;
	}
	
	public String toString(){
		return super.toString() + ",student id:" + myIdNum + ",GPA: " + myGPA;
	}
	
	public double getGPA(){
		return myGPA;
	}
	
	public String getIdNum(){
		return myIdNum;
	}
	
	public void setGPA(double gpa){
		myGPA = gpa;
	}
	
	public void setIdNum(String id){
		myIdNum = id;
	}

}
