/*
Consider the following game. Alice writes down two integers between 0 and 100 on two cards.
Bob gets to select one of the two cards and see its value. After looking at the value,
Bob commits to one of the two cards. If he chooses a card with the largest value, he wins;
otherwise he loses. Devise a strategy (and corresponding computer program) for Bob so that
he guarantees to win strictly more than half the time.
 */

public class Biggest {
    public static void main(String[] args) {
        int firstNum = (int)(Math.random()*100);
        int secondNum = (int)(Math.random()*100);
        int bobsPick;
        System.out.println("First number " + firstNum + ". Second number " + secondNum);
        if (firstNum>50) {
            bobsPick = firstNum;
        } else {
            bobsPick = secondNum;
        }
        System.out.println("Bob picks " + bobsPick + ".");

    }
}