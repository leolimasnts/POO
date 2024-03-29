/*
Make a program that
a) guess the number the user thought of between 0 and 100 and
b) say the number of calls the program needed to make to find
the number.

Your program should only ask the user if the number printed on
the screen is the number correct. If not, ask if the number is
greater or less than that displayed.
*/

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
            System.out.print("My guess is " + guesser.getGuess() +
                    "\nI won? (y/n): ");

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
