package ativ06;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Guesser guesser = new Guesser();

        System.out.println("Lets play a game, think in a number between 0 and 100\n" +
                "and im gonna try to guess it, ready?");

        while (true) {
            guesser.generateGuess();
            guesser.count();
            System.out.println("My guess is " + guesser.getGuess() +
                    "\nI won? (y/n)");

            if (guesser.iGuessed(sc1.nextLine()))
                break;

            System.out.print(":( so... your number is bigger (+) or lower (-) than my guess? ");
            guesser.adjustMinMaxValues(sc1.nextLine());

            System.out.println("Alright, lets try again..\n\n");
        }
        System.out.println("easy peasy, it only took me " +
                guesser.getCounter() + " try(ies)");

        sc1.close();
    }

}
