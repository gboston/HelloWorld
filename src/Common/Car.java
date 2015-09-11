package Common;

/**
 * Created by glenn on 9/12/2015.
 */
public class Car {
    private String brand;
    private int fuelLeft;
    private int yearBought;
    private int ensurance;
    private String owner;

    public Car(String brand, int fuelLeft, int yearBought, int ensurance, String owner) {
        this.brand = brand;
        this.fuelLeft = fuelLeft;
        this.yearBought = yearBought;
        this.ensurance = ensurance;
        this.owner = owner;
    }
}
