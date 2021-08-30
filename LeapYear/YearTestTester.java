import java.util.Scanner;

public class YearTestTester {
public static void main (String[]args) {
  
 Scanner kb=new Scanner(System.in);

System.out.print("Input your year to test");
int yearTest = kb.nextInt();
YearTest myTest = new YearTest(yearTest); 

if (myTest.isLeapYear()) {
 System.out.println("Your year is a leap year");
}
else {
 System.out.println("Your year is not a leap year");
}
   
}
}