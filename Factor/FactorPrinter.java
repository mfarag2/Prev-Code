import java.util.Scanner;

public class FactorPrinter{
  public static void main(String [] args){
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number to Factor:");
    int numberToFactor = in.nextInt();
    
    System.out.println("You chose: "+numberToFactor+" to factor.");
    
    FactorGenerator fg = new FactorGenerator(numberToFactor);
    
    while (fg.hasMoreFactors())
      System.out.println(fg.nextFactor());
  }
}

/*
Enter a number to Factor: [ 36 ]
You chose: 36 to factor.
2.0
2.0
3.0
3.0
*/