public class FibonacciGenerator {
    private int f1;
    private int f2; 
    private int sum; 
    
    public FibonacciGenerator () {
      f1= 0;
      f2= 1;
    }
    
    public double nextNumber() {
      
      sum=f1+f2;
      f1=f2;
      f2=sum;
      return f1; 
  
    }
  }
      
      