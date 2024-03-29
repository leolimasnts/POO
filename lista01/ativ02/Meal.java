package ativ02;

public class Meal {
    private int ammountOfRequestedMeals;
    private int ammountOfAvaliableMeals;

    String missingMeals() {
        if (ammountOfAvaliableMeals >= ammountOfRequestedMeals) return "no";
        return Integer.toString(ammountOfRequestedMeals - ammountOfAvaliableMeals);
    }

    public void setAmmountOfAvaliableMeals(int ammountOfAvaliableMeals) {
        this.ammountOfAvaliableMeals = ammountOfAvaliableMeals;
    }
    public void setAmmountOfRequestedMeals(int ammountOfRequestedMeals) {
        this.ammountOfRequestedMeals = ammountOfRequestedMeals;
    }
}
