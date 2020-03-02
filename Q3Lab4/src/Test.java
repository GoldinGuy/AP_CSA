
public class Test {


	public static void main(String[] args) {

		Person De = new Person("Coach De",27, "M");
		System.out.println(De);
		Student Emily = new Student("Emily Rowland",16, "F", "HS95129",3.5);
		System.out.println(Emily);
		Teacher mrRiche = new Teacher("Jackson Riche",34, "M","Computer Science",185000.0);
		System.out.println(mrRiche);
		CollegeStudent Jason = new CollegeStudent("Jason Smith", 17, "M","UCB123", 4.0,1,"English");
		System.out.println(Jason);
		
		Jason.setIdNum("123456");
		Jason.setGPA(3.1);
		System.out.println(Jason);
		System.out.println(Jason.getIdNum());
		System.out.println(	Jason.getGPA());
		Emily.setIdNum("123456");
		Emily.setGPA(3.1);
		mrRiche.setSalary(35000);
		System.out.println(mrRiche.getSalary());
		
		System.out.println(Emily);
		Jason.getIdNum();
		Jason.getGPA();
		
		
		
	}

}
