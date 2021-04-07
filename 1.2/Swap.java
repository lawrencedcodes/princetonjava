

public class Swap {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int temp = j;
        System.out.println(i + " " + j);
        j = i;
        i = temp;
        System.out.println(i + " " + j);
    }
}