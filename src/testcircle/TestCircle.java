/*
 * TestCircle.java
 * Kaune
 * May 25,2022
 * This program tests the Circle class
 */

package testcircle;

/**
 *
 * @author rkaune
 */
public class TestCircle {
    public static void main(String[] args) {
        int number =1;
        String thing = "thing";
        thing+=number;
        Circle spot = new Circle();
        spot.setRadius(5);
        System.out.println("Circle radius:" + spot.getRadius());
        System.out.println("Circle area: " + spot.area());
    }
}
