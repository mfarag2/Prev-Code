public class FactorGenerator {
  private int num; 
  private int factor; 

  /*Use a class FactorGenerator with a constructor FactorGenerator(int numberToFactor)
    and methods nextFactor() and hasMoreFactors(). */
  public FactorGenerator(int numberToFactor) {
    num=numberToFactor;
    factor=2;
  }
  
  public double nextFactor() {

    num=num/factor;
    
    if  (num%factor==0) { 
      return factor; 
    }
    else  {
    return factor++;
    
    }
      
  }
  
  public boolean hasMoreFactors() // Uses loops and decisions to find if there
                                    // are more factors
    {
        boolean morefactors = false;
        
       if (num%factor==0)
         morefactors=true; 
       
       if (num%factor!=0) {
         if (num%(factor+1)==0) {
         morefactors=true; 
         }
         else 
           morefactors=false;
       }
  return morefactors;
    }
      
}

  