/* 
 * Circle.java
 * Kaune
 * May 25,2022
 * This program defines the Circle class, its states, constructors,
 * and methods
 */

package testcircle;

/**
* Circle class 2022.
*/
public class Circle {
    private static final double PI = 3.14;
    private double radius;
    
    /**
    * constructor
    * pre: none
    * post: A Circle object created. Radius initialized to 1.
    */
    public Circle() {
        radius = 1; //default radius
    }
    
    /**
    * constructor
    * pre: A valid radius is passed
    * post: A Circle object created. Radius initialized to r.
    * @param r integer the radius of the circle created
    */
    public Circle(int r) {
        radius = r; //default radius
    }
    
    /**
    * Changes the radius of the circle.
    * pre: none
    * post: Radius has been changed.
    * @param newRadius double representing the new radius of the circle
    */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    
    /**
    * Calculates the area of the circle.
    * pre: none
    * post: The area of the circle has been returned.
     * @return double circleArea, the area of the circle
    */
    public double area() {
        double circleArea;
        circleArea = PI * radius * radius;
        return(circleArea);
    }
    
    /**
    * Returns the radius of the circle.
    * pre: none
    * post: The radius of the circle has been returned.
     * @return double radius, the current radius of the circle
    */
    public double getRadius() {
        return(radius);
    }
}

