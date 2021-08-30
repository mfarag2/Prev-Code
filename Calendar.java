//mary farag
/* Your task is to write a program that prints the following information:
The date and weekday that is 100 days from today
The weekday of your birthday
The date that is 10,000 days from your birthday */ 

import java.util.GregorianCalendar;
  public class Calender     
  {
    public static void main (String [] args)
    {
      GregorianCalendar cal = new GregorianCalendar();
      cal.add(GregorianCalendar.DAY_OF_MONTH, 100);
      int day = cal.get(GregorianCalendar.DAY_OF_MONTH);  
      int month = cal.get(GregorianCalendar.MONTH);
      int year = cal.get(GregorianCalendar.YEAR);
      int weekDay = cal.get(GregorianCalendar.DAY_OF_WEEK);
     
      String dayofWeek = ("Hi");
      if (weekDay == 1)
        dayofWeek=("Sunday");
      else if (weekDay== 2)
        dayofWeek=("Monday");
      else if (weekDay==3)
        dayofWeek=("Tuesday");
      else if (weekDay==4)
        dayofWeek=("Wednesday");
      else if (weekDay==5)
        dayofWeek=("Thursday");
      else if (weekDay==6)
        dayofWeek=("Friday");
      else if (weekDay==7)
        dayofWeek=("Saturday");
      
      String monthName = ("Hi");
      if (month==0)
        monthName= ("January");
      else if (month==1)
        monthName= ("February");
      else if (month==2)
        monthName= ("March");
      else if (month==3)
        monthName= ("April");
      else if (month==4)
        monthName=("May");
      else if (month==5)
        monthName=("June");
      else if (month==6)
        monthName=("July");
      else if (month==7)
        monthName=("August");
      else if (month==8)
        monthName=("September");
      else if (month==9)
        monthName=("October");
      else if (month==10)
        monthName=("November");
      else if (month==11)
        monthName=("December");
        
      System.out.println ("The date 100 days from today is "+dayofWeek+", "+monthName+" "+day+ ", "+year);
      
      
      GregorianCalendar marysBirthday = new GregorianCalendar(2003, GregorianCalendar.JUNE, 18);
      int birthDay= marysBirthday.get(GregorianCalendar.DAY_OF_WEEK);
      
      String birthWeekDay = ("Hi");
      if (birthDay == 1)
        birthWeekDay=("Sunday");
      else if (birthDay== 2)
        birthWeekDay=("Monday");
      else if (birthDay==3)
        birthWeekDay=("Tuesday");
      else if (birthDay==4)
        birthWeekDay=("Wednesday");
      else if (birthDay==5)
        birthWeekDay=("Thursday");
      else if (birthDay==6)
        birthWeekDay=("Friday");
      else if (birthDay==7)
        birthWeekDay=("Saturday");
      
      System.out.println ("The weekday of your birthday is "+birthWeekDay);
      
      marysBirthday.add(GregorianCalendar.DAY_OF_MONTH, 10000);
      int newDay = marysBirthday.get(GregorianCalendar.DAY_OF_MONTH);  
      int newMonth = marysBirthday.get(GregorianCalendar.MONTH);
      int newYear = marysBirthday.get(GregorianCalendar.YEAR);
      
      String newMonthName = ("Hi");
      if (newMonth==0)
        newMonthName= ("January");
      else if (newMonth==1)
        newMonthName= ("February");
      else if (newMonth==2)
        newMonthName= ("March");
      else if (newMonth==3)
        newMonthName= ("April");
      else if (newMonth==4)
        newMonthName=("May");
      else if (newMonth==5)
        newMonthName=("June");
      else if (newMonth==6)
        newMonthName=("July");
      else if (newMonth==7)
        newMonthName=("August");
      else if (newMonth==8)
        newMonthName=("September");
      else if (newMonth==9)
        newMonthName=("October");
      else if (newMonth==10)
        newMonthName=("November");
      else if (newMonth==11)
        newMonthName=("December");
      
      System.out.println ("The date 10,000 days from your birthday is "+newMonthName+" "+newDay+ ", "+newYear);
     
      /* Output: 
         The date 100 days from today is Tuesday, January 22, 2019
         The weekday of your birthday is Wednesday
         The date 10,000 days from your birthday is November 3, 2030*/
    }
  }



    