
public class Janitor extends StaffMember {

    public Janitor(String eName, String eAddress, String ePhone, String socSec, double payRate) {
        super(eName, eAddress, ePhone, socSec, payRate);
    }
 
    public String doJob() {
       return "I am a janitor";
    }
 
    public double pay() {
       return super.pay();
    }
 }
 
 