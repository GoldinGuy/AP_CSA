
public class Hospital {
// creates several objects from class derived from 
// HospitalEmployee
	
	public static void main(String[] args) {
		
		HospitalEmployee vito = new HospitalEmployee("Vito", 1111);
		Doctor micheal = new Doctor("Micheal", 1112, "Cancer");
		Surgeon vincent = new Surgeon("Vincent", 1113, "Nuero", true);
		Nurse sonny = new Nurse("Sonny", 1114, 5);
		Administrator luca = new Administrator("Luca", 1115, "Surgery");
		Receptionist tom = new Receptionist("Tom", 1116, "Call Center", false );
		Janitor anthony = new Janitor("Anthony", 1117, "Janitorial", false );
		
		//print the employees
		System.out.println(vito); // a hospital employee
		System.out.println(micheal); // a doctor
		System.out.println(vincent); // a surgeon
		System.out.println(sonny); // a nurse
		System.out.println(luca); // an administrator
		System.out.println(tom); // a receptionist
		System.out.println(anthony); //a janitor
		
		//invoke the specific methods of the objects
		vito.work();
		micheal.diagnose();
		vincent.operate();
		sonny.assist();
		luca.administrate();
		tom.answer();
		anthony.sweep();
		
	}

}
