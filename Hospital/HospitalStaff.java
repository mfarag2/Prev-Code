public class hospitalStaff {
    private StaffMember[] staffList;
    private String[] jobFunctionsList;
 
    public hospitalStaff() {
 
        {
            staffList = new StaffMember[4];
            jobFunctionsList = new String[4];
 
            Surgeon Turk = new Surgeon("Turk", "789 Off Rocker",
                    "555-0000", "010-20-3040", 1169.23);
 
            staffList[0] = Turk;
            jobFunctionsList[0] = Turk.doJob();
 
            Doctor Cox = new Doctor("Dr. Cox", "678 Fifth Ave.",
                    "555-0690", "958-47-3625", 10.55);
 
            staffList[1] = Cox;
            jobFunctionsList[1] = Cox.doJob();
 
 
            Janitor JD = new Janitor("J.D.", "987 Suds Blvd.",
                    "555-8374", "887646353", 42844);
 
            staffList[2] = JD;
            jobFunctionsList[2] = JD.doJob();
 
 
            Surgeon Carla = new Surgeon("Carla", "321 Duds Lane",
                    "555-7282", "4729394", 4274);
 
            staffList[3] = Carla;
            jobFunctionsList[3] = Carla.doJob();
 
        }
    }
 
    public void payday() {
        double amount;
 
        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);
 
            amount = staffList[count].pay();  // polymorphic
 
            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);
 
            System.out.println(jobFunctionsList[count]);
            System.out.println();
            System.out.println("-----------------------------------");
        }
    }
 }
 
 