package Q3;
//import statements
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*; 
import static java.time.temporal.ChronoUnit.MINUTES;

public class Attendence extends Persons {
//	create scanner, arraylists, etc
	BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	Scanner s = new Scanner(System.in);
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<Integer> pins = new ArrayList<Integer>();
	ArrayList<Boolean> log = new ArrayList<Boolean>();
	ArrayList<LocalTime> start = new ArrayList<LocalTime>();
	ArrayList<Long> time = new ArrayList<Long>();
	ArrayList<Integer> sessions = new ArrayList<Integer>();
	
	public void runMenu() throws IOException{
//		pull data from file
		inputFromFile();
		int pin = 0000, isIn = 0, j = 0, allIn = 0;
//		run loop menu
		while(true){
			System.out.println("\n_____________________________________\n\nWelcome to the Team 179 Build Site");
//			determine if anyone is signed in
			for(int i=0; i<names.size();i++){
				if(log.get(i)){
					allIn += 1;
				}
			} 
			if (allIn > 0){
				System.out.println("\nCurrently signed in:");
			}
//			print who is signed in
			for(int i=0; i<names.size();i++){
				if(log.get(i)){
					System.out.println(names.get(i));
				}
			} 
//			determine pins
			System.out.println("\nEnter your pin");
			pin = s.nextInt();
			for(int i=0; i<names.size();i++){
				if(pin == pins.get(i)){
					isIn += 1;
					j = i;
				} else if(pin == 179){	
					isIn = -1;
				}
			} //end for
//			errors
			if(isIn == 0){
				System.out.println("\nInvalid pin number. Please try again.");
			} else if(isIn > 0){
//				if logged in...
				if (log.get(j)){
					log.set(j, false);
					time.set(j, time.get(j) + getDateDiff(start.get(j), getDate()));
					sessions.set(j, sessions.get(j)+1);
					// calculate time at build site for that day
					long hours = (getDateDiff(start.get(j), getDate())) / 60; 
					long minutes = (getDateDiff(start.get(j), getDate())) % 60;
					System.out.print("\n\nThanks for coming, " + names.get(j) + ". \nYou were at the build site today for ");
					System.out.printf("%d and %02d", hours, minutes);
					System.out.println(" minutes.");
//					if not logged in...
				} else 	if (log.get(j) == false){
					log.set(j, true);
					start.set(j, getDate());
					System.out.println("\nWelcome, " + names.get(j) + ". \nYou have been logged in.");
				} 
//				send to file output
			} else if (isIn < 0){
				System.out.println("\nAll data has been compiled and delivered to file attendence_data.txt");
				outputToFile();
				break;
			}
			isIn = 0;
			
		} // end while
	} // end method
	
	public void inputFromFile() throws IOException{
//		import data from file
		Scanner fileScan = new Scanner (new File("D:/Eclipse/Data/workspace/AP_CSA/src/Q3/input_data.txt"));
//		initialize arraylists
		while(fileScan.hasNext()) {
			pins.add(fileScan.nextInt());
			names.add(fileScan.next());
		}
		fileScan.close();
//		initialize more arraylists
		for(int i=0; i<names.size();i++){
			log.add(false);
		}
		for(int i=0; i<names.size();i++){
			time.add((long) 0);
			sessions.add(0);
		}
		for(int i=0; i<names.size();i++){
			start.add(getDate());
		}
		
	}
	
	public void outputToFile() throws IOException{
//		output to file
		FileWriter file2 = new FileWriter("attendence_data.txt");
		PrintWriter outputFile = new PrintWriter(file2);
		for(int i=0; i<names.size();i++){
			outputFile.println(names.get(i));
			outputFile.println("Total Hours: " + time.get(i));
			outputFile.println("Total Sessions: " + sessions.get(i));
			outputFile.println("Percent Attendance: " + sessions.get(i)/100);
		}
		outputFile.close();
	}
	
//	get local time
	public LocalTime getDate(){
		LocalTime time = LocalTime.now();
		return time;
	} 
	
//	find difference in minutes between logging in and logging out
	public long getDateDiff(LocalTime date1, LocalTime date2) {
	    return MINUTES.between(date1, date2);
	}

//main
	public static void main(String[]args) throws IOException {
		Attendence attend = new Attendence();
		attend.runMenu();
	} //end of main
} //end class
