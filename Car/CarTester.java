
public class CarTester {
    public static void main(String[] args) {
        Car lambo = new Car (100);
        lambo.addGas(100);
        lambo.drive(50);
        System.out.println ("The gas remaining in your tank is "+lambo.getGasInTank()+" gallons after driving "+ 50 +" miles.");
    }
 }
 /* > run CarTester
 The gas remaining in your tank is 98.0 gallons after driving 50 miles. */