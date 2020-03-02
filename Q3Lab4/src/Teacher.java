
public class Teacher extends Person {

	public String subject;
	public double salary;
	
	public Teacher(String name, int age, String gender, String sub, double sal) {
		super(name, age, gender);
		salary = sal;
		subject = sub;
	}
	
	public String toString(){
		return super.toString() + ",subject:" + subject + ",salary: " + salary;
	}

	public double getSalary(){
		return salary;
	}
	
	public String getIdNum(){
		return subject;
	}
	
	public void setSalary(double sal){
		salary = sal;
	}
	
	public void setSubject(String sub){
		subject = sub;
	}

}
