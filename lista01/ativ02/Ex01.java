package ativ02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        Meal chicken = new Meal();
        Meal beef = new Meal();
        Meal pasta = new Meal();

        System.out.print("Ammount of avaliable chicken meals: ");
        chicken.setAmmountOfAvaliableMeals(sc1.nextInt());
        System.out.print("Ammount of requested chicken meals: ");
        chicken.setAmmountOfRequestedMeals(sc1.nextInt());
        
        System.out.print("\nAmmount of avaliable beef meals: ");
        beef.setAmmountOfAvaliableMeals(sc1.nextInt());
        System.out.print("Ammount of requested beef meals: ");
        beef.setAmmountOfRequestedMeals(sc1.nextInt());

        System.out.print("\nAmmount of avaliable pasta meals: ");
        pasta.setAmmountOfAvaliableMeals(sc1.nextInt());
        System.out.print("Ammount of requested pasta meals: ");
        pasta.setAmmountOfRequestedMeals(sc1.nextInt());

        sc1.close();

        System.out.println("\n" + chicken.missingMeals() + " chicken meals missing");
        System.out.println(beef.missingMeals() + " beef meals missing");
        System.out.println(pasta.missingMeals() + " pasta meals missing");
    }
}
