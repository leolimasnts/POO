package ativ05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".000");

        Scanner sc1 = new Scanner(System.in);
        Travel travel = new Travel();

        System.out.print("Travel time (h): ");
        travel.setTravelTimeInHours(sc1.nextFloat());

        System.out.print("Travel speed (Km/h)");
        travel.setSpeedInKmH(sc1.nextFloat());
        sc1.close();

        travel.setFuelNeededInLiters();
        System.out
                .print("\nFor this travel, you spent " + 
                df.format(travel.getFuelNeededInLiters()) + 
                " liters of gas");
    }
}
