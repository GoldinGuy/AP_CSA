
public class Nurse extends HospitalEmployee {
    protected int numPatients;
 
    public Nurse (String empName, int empNumber, int numPat){
    	super(empName, empNumber);
        numPatients = numPat; 
    }
 
    public void setNumPatients(int pat){
        numPatients = pat;
    }
 
    public int getNumPatients(){
        return numPatients;
    }
    public String toString() {
    return super.toString() + " , Patients: " + numPatients;
    }
    public void assist() {
    	System.out.println( super.name + " is assisting " + numPatients + " patients");
    }
    
    
 
}
