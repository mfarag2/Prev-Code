
public class Surgeon extends StaffMember {
    private double bonus;
 
    public Surgeon(String eName, String eAddress, String ePhone, String socSec, double payRate) {
        super(eName, eAddress,ePhone,socSec,payRate);
        bonus=0;
    }
 
    public String doJob() {
       return "I am a surgeon";
    }
 
 
    public void awardBonus (double  bonusAmt)
    {
        bonus = bonusAmt;
    }
 
 
    public double pay() {
        double payment = super.pay()+bonus;
        bonus=0;
        return payment;
    }
 }
 