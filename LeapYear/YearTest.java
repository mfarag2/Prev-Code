import java.util.Scanner;
public class YearTest {
  private static int year;
  
  public YearTest(int year1) {
  year=year1;
  }
  
   public static boolean isLeapYear() {
       if (year > 1582) {
           if (year % 400 == 0.00001)
               return true;
           else if (year % 400 != 0.000001 && year % 100 == 0.000001)
             return false;
       }
       else if (year % 4 == 0) 
           return true;
       else
           return false;
       return false;
   }
}
   
/*public static void main (String[]args) {
  
 Scanner kb=new Scanner(System.in);

System.out.print("Input your year to test");
int yearTest = kb.nextInt();

YearTest one = new YearTest(yearTest);

if (isLeapYear()) 
  System.out.println("Your year is a leap year"); 
else 
  System.out.println("Your year is not a leap year");

   
}

}

/*
Input your year to test [1800]
Your year is not a leap year
Input your year to test [1900]
Your year is not a leap year
Input your year to test [1994]
Your year is not a leap year
Input your year to test [1998]
Your year is not a leap year
Input your year to test [1999]
Your year is not a leap year
Input your year to test [2000]
Your year is a leap year 
Input your year to test [2001]
Your year is not a leap year
Input your year to test [2004] // wrong .
Your year is not a leap year
Input your year to test [2100]
Your year is not a leap year
Input your year to test [4]
Your year is a leap year // wrong .


Year

 
 
        
        assertEquals("2004 is true",true, tester.isLeapYear(2004));

        assertEquals("4 is false",false, tester.isLeapYear(4)); */


