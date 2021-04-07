/*
Write a program RGBtoYIQ.javathat takes an RGB color (three integers between 0 and 255) and
transforms it to a YIQ color (three different real numbers Y, I, and Q, with 0 ≤ Y ≤ 1, –0.5957 ≤ I ≤ 0.5957,
and –0.5226 ≤ Q ≤ 0.5226). Write a program YIQtoRGB.java that applies the inverse transformation.
 */

public class RGBtoYIQ {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double y = 0.299*r + 0.587*g + 0.114*b;
        double i = (0.596*r) - (0.275*g) - (0.321*b);
        double q = 0.212*r - 0.523*g + 0.311*b;

        System.out.println("The YIQ values are " + y + " " + i + " " + q + ".");

    }
}