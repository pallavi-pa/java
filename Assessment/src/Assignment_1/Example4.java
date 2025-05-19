package Assignment_1;
interface Electric {
    void chargeBattery();
}
interface Luxury {
    void activateMassageSeats();
}
class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}


class TeslaModelS extends Vehicle implements Electric, Luxury {
    int batteryLevel;

    public TeslaModelS(String make, String model, int year, int batteryLevel) {
        super(make, model, year);
        this.batteryLevel = batteryLevel;
    }

    public void chargeBattery() {
        System.out.println("Charging the Tesla Model S...");
        batteryLevel = 100;
        System.out.println("Battery fully charged. Battery Level: " + batteryLevel + "%");
    }

    public void activateMassageSeats() {
        System.out.println("Activating massage seats...");
    }

    public void displayTeslaInfo() {
        displayInfo();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}

public class Example4 {
    public static void main(String[] args) {
        TeslaModelS myTesla = new TeslaModelS("Tesla", "Model S", 2025, 50);
        myTesla.displayTeslaInfo();
        myTesla.chargeBattery();
        myTesla.activateMassageSeats();
    }
}
