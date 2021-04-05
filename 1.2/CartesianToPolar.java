/*Write a program CartesianToPolar.java that converts from Cartesian to polar coordinates.
Your program should take two real numbers x and y on the command line and print the polar
coordinates r and θ. Use the Java method Math.atan2(y, x), which computes the arctangent
value of y/x that is in the range from -π to π.
 */

public class CartesianToPolar {
    public static void main (String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        int polar = (int) Math.atan2(y,x);
        System.out.println(polar);
    }
}