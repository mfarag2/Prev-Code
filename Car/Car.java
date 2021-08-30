/**
 * @author Mary Farag
 * @version 1.0
 * Calculates the remaining fuel in a car's tank after driving a given distance
 */

public class Car {
    private double efficiency;
    private double fuel;
 
    /**
      * Creates a new car with an assigned fuel efficiency and initial fuel level of 0
      * PreCondition: must be positive
      * @param initialEfficiency the efficiency of your vehicle
      */
    public Car(double initialEfficiency) {
        efficiency = initialEfficiency;
        fuel = 0;
    }
 /**
  * Simulates a car drive with a given distance to calculate remaining fuel
  * PreCondition: distance must be positive
  * @param distance driven in simulation
  * 
  */ 
    public void drive (double distance) {
       fuel= fuel - efficiency/distance;
 
    }
 /**
  * Returns the amount of gas in tank
  * @return fuel level
  */ 
    public double getGasInTank () {
        return fuel;
    }
 /**
  * Adds additional gas to tank
  * @param newFuel the amount of gas added to tank
  */ 
    public void addGas (double newFuel) {
        fuel = fuel + newFuel;
 
    }
 }
 