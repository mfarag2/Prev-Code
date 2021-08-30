import java.util.Scanner;
public class FibonacciRunner
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter n:");
    int n = in.nextInt();
    
    FibonacciGenerator fg = new FibonacciGenerator();
    
    for (int i = 1; i <= n; i++)
      System.out.println(fg.nextNumber());
  }
}
 
/* 1.0
1.0
2.0
3.0
5.0
8.0 */