
public class Doctor extends StaffMember {

    public Doctor(String eName, String eAddress, String ePhone, String socSec, double payRate) {
        super(eName, eAddress, ePhone, socSec, payRate);
    }
 
    public String doJob() {
     return "I am a doctor";
    }
 
 
    public double pay() {
        return super.pay();
    }
 }
 
 
 
 