public class Balloon {
    private double airAmt;
 
 
    public Balloon () {
        airAmt=0;
 
    }
    public void addAir(double amount) {
        airAmt=airAmt+amount;
    }
    
    public double getVolume() {
   //  airAmt=amount+airAmt;  
      return airAmt;
 
    }
 
    public double getRadius() {
     return Math.cbrt(((airAmt*3/4)/(Math.PI)));
      
    }
 
    public double getSurfaceArea() {
        return (4*Math.PI*((getRadius()*getRadius())));
    }
 
 }
 
 /* Initial:
 Balloon Volume: 0.0
 Balloon Surface Area: 0.0
 Balloon Radius: 0.0
 
 After adding initial first 100 cm^3:
 Balloon Volume: 100.0
 Balloon Surface Area: 104.18794157356086
 Balloon Radius: 2.8794119114848606
 
 After adding another 100 cm^3:
 Balloon Volume: 200.0
 Balloon Surface Area: 165.38804805627186
 Balloon Radius: 3.6278316785978095
 */