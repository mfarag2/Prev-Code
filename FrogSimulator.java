public class frogSimulator {
    private int goalDistance;
    private int maxHops; 
    
    public frogSimulator(int dist, int numHops){
      goalDistance=dist;
      maxHops = numHops;
    }
    
    private int hopDistance(){
      return Math.random(1,10);
  
    }
    public boolean simulate(){
      for(int i=0; i<maxHops; i++){
        int record=0;
        record+=hopDistance();
      }
      if (record>=goalDistance) {
        return true; 
        else {
          return false; 
        }
      }
    }
    
    public double runSimulations(int num){
      double trueCount=0;
      double falseCount=0;
      
      for (int i=0; i<num; i++) {
        if (simulate()) {
          trueCount++; }
        else { 
          falseCount++
        }
        
        return (trueCount/falseCount);
          
    }
    
      
      
      
    public static void main(String[] args) {
      
      frogSimulator sim = new frogSimulator(24,5); //24 is the goal distance, 5 is the maximum num hops
      sim.simulate();
    }
  }