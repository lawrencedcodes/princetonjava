/*
Write a program that takes two int values m and d from the command line and prints true if day d of month m
is between March 20 (m = 3, d =20) and June 20 (m = 6, d = 20), false otherwise.
 */

public class SpringSeason {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean firstSequence;
        boolean secondSequence;
        boolean thirdSequence;
        boolean fourthSequence;

        boolean springOrNot = (m == 3 && d >= 20) ||
                (m == 4) ||
                (m == 5) ||
                (m == 6 && d <= 20);

        System.out.println(springOrNot);
    }
}