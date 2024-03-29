package ativ05;

public class Travel {
    private float travelTimeInHours;
    private float speedInKmH;
    private float fuelNeededInLiters;

    public void setSpeedInKmH(float speedInKmH) {
        this.speedInKmH = speedInKmH;
    }
    public void setTravelTimeInHours(float travelTimeInHours) {
        this.travelTimeInHours = travelTimeInHours;
    }


    public void setFuelNeededInLiters() {
        this.fuelNeededInLiters = this.speedInKmH * this.travelTimeInHours; 
    }

    public float getFuelNeededInLiters() {
        return fuelNeededInLiters;
    }
}
