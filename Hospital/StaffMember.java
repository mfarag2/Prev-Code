
abstract public class StaffMember
{
   private String name;
   private String address;
   private String phone;
   private String social;
   private double rate;

   //-----------------------------------------------------------------
   //  Sets up a staff member using the specified information.
   //-----------------------------------------------------------------
   public StaffMember (String eName, String eAddress, String ePhone, String socSec, double payRate)
   {
       name = eName;
       address = eAddress;
       phone = ePhone;
       social=socSec;
       rate=payRate;
   }

   //-----------------------------------------------------------------
   //  Returns a string including the basic employee information.
   //-----------------------------------------------------------------
   public String toString()
   {
       String result = "Name: " + name + "\n";

       result += "Address: " + address + "\n";
       result += "Phone: " + phone;

       return result;
   }

   //-----------------------------------------------------------------
   //  Derived classes must define the pay method for each type of
   //  employee.
   //-----------------------------------------------------------------


   public double pay() {
       return rate;
   }
}

