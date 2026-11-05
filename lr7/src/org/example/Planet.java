package org.example;

public class Planet extends CelestialBody {
    private int moons;

    public Planet(String name, double mass, double diameter, int moons) {
        super(name, mass, diameter);
        this.moons = moons;
    }

    public int getMoons() {
        return moons;
    }

    @Override
    public String getType() {
        return "Планета";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Спутников: %d%n", moons);
    }

    public double getGravity() {
        double radius = getDiameter() / 2;
        return getMass() / (radius * radius);
    }
}
