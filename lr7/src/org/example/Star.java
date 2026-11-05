package org.example;

public class Star extends CelestialBody {
    private double temperature;

    public Star(String name, double mass, double diameter, double temperature) {
        super(name, mass, diameter);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getType() {
        return "Звезда";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Температура: %.0f%n", temperature);
    }

    public double getLuminosity() {
        return getDiameter() * temperature;
    }
}
