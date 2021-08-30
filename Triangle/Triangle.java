
/**
        * @author Mary Farag
        * @version 1.3
        * Calculates the lengths of a triangle's sides, it's angle measures, perimeter, and area.
        */

        public class Triangle {
            private double xcoord1;
            private double ycoord1;
            private double xcoord2;
            private double ycoord2;
            private double xcoord3;
            private double ycoord3;
        
            /**
             * Creates a new triangle with x-y coordinates for 3 points
             * @param x1 the x coordinate of your 1st point
             * @param y1 the y coordinate of your 1st point
             * @param x2 the x coordinate of your 2nd point
             * @param y2 the y coordinate of your 2nd point
             * @param x3 the x coordinate of your 3rd point
             * @param y3 the y coordinate of your 3rd point
             */
            
            public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
                xcoord1 = x1;
                ycoord1 = y1;
                xcoord2 = x2;
                ycoord2 = y2;
                xcoord3 = x3;
                ycoord3 = y3;
            }
        
            /**
             * Calculates the length of the triangle's first side (sideA)
             * @return the length of sideA
             */
            public double getLengthA() {
                return (Math.sqrt(Math.pow((xcoord2 - xcoord1), 2.0)+ (Math.pow((ycoord2 - ycoord1), 2.0))));
        
            }
            /**
             * Calculates the length of the triangle's second side (sideB)
             * @return the length of sideB
             */
            public double getLengthB() {
                return (Math.sqrt(Math.pow((xcoord3 - xcoord2), 2.0)+ (Math.pow((ycoord3 - ycoord2), 2.0))));
            }
            /**
             * Calculates the length of the triangle's third side (sideC)
             * @return the length of sideC
             */
            public double getLengthC() {
                return (Math.sqrt(Math.pow((xcoord3 - xcoord1), 2.0) + (Math.pow((ycoord3 - ycoord1), 2.0))));
            }
        
              public double getX () {
             return (Math.pow(getLengthA(), 2)-((Math.pow(getLengthC(), 2) - Math.pow(getLengthB(), 2))))/(2*getLengthB());
           }
        
            /**
             * Calculates and returns the height of the triangle
             * @return the height
             */
        
            public double getHeight() {
                return Math.sqrt(Math.pow(getLengthA(), 2) - Math.pow(getX(), 2));
            }
        
            /**
             * Calculates the angle measures of the triangle's first angle (angleA)
             * @return angle measure (angleA)
             */
        
            public double calculateAngleA() {
                return Math.acos((getLengthB() * getLengthB() + getLengthC() * getLengthC() - getLengthA() * getLengthA())/(2.0 * getLengthB() * getLengthC())); 
        
            }
            
            /**
             * Calculates the angle measures of the triangle's second angle (angleB)
             * @return angle measure (angleB)
             */
        
            public double calculateAngleB() {
               return Math.acos((getLengthA() * getLengthA() + getLengthC() * getLengthC() - getLengthB() * getLengthB())/(2.0 * getLengthA() * getLengthC())); 
            }
            
            /**
             * Calculates the angle measures of the triangle's third angle (angleC)
             * @return angle measure (angleC)
             */
        
            public double calculateAngleC() {
               return Math.acos((getLengthA() * getLengthA() + getLengthB() * getLengthB() - getLengthC() * getLengthC())/(2.0 * getLengthA() * getLengthB())); 
            }
        
            /**
             * Calculates and returns the perimeter of the triangle
             * @return perimeter of triangle
             */
        
            public double getPerimeter() {
                return getLengthA() + getLengthB() + getLengthC();
            }
        
            /**
             * Calculates and returns the area of the triangle
             * @return area of the triangle
             */
        
            public double getArea() {
                return (1.0 / 2) * getLengthB() * getHeight();
            }
        
            /**
             * Displays all the calculated properties of your triangle
             */
        
            public void DisplayData() {
                System.out.println("Your three points are "+"\t"+"("+xcoord1+", "+ ycoord1 +")"+"("+xcoord2+", "+ycoord2+")"+"("+xcoord3+", "+ycoord3+")");
                System.out.println("\n");
                System.out.println("The length of side A is: "+"\t "+getLengthA());
                System.out.println("The length of side B is: "+"\t" +getLengthB());
                System.out.println("The length of side C is: "+"\t" +getLengthC());
                System.out.println("\n");
                System.out.println("Angle A has a measure of "+"\t" +Math.toDegrees(calculateAngleA())+" degrees");
                System.out.println("Angle B has a measure of "+"\t" +Math.toDegrees(calculateAngleB())+" degrees");
                System.out.println("Angle C has a measure of "+"\t" +Math.toDegrees(calculateAngleC())+" degrees");
                System.out.println("\n");
                System.out.println("The triangle height is: "+"\t"+ getHeight());
                System.out.println("The perimeter is: "+"\t"+"\t"+ getPerimeter());
                System.out.println("The area is: "+"\t"+"\t"+ getArea());
        
        
        
            }
        
        }
        
        
        
        