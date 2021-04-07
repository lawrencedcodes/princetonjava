/*
Write a program DivideByZero.java to see what happens when you divide an int or double by zero.
Solution:

(17 / 0) and (17 % 0) result in a division by zero exception;
(17.0 / 0.0) results in a value Infinity;
(17.0 % 0.0) results in a value NaN that stands for "not a number."
 */


public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("17 divided by 0 is " + 17/0);
        System.out.println("17.0 divided by 0.0 is " + 17.0/0.0);

    }
}