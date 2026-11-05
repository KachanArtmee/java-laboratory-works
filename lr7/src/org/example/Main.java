package org.example;

public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Земля", 5972, 12742, 1);
        Planet mars = new Planet("Марс", 641, 6779, 2);
        Star sun = new Star("Солнце", 1989000, 1392700, 5778);

        earth.displayInfo();
        System.out.printf("Условная гравитация: %.6f%n%n", earth.getGravity());

        mars.displayInfo();
        System.out.printf("Условная гравитация: %.6f%n%n", mars.getGravity());

        sun.displayInfo();
        System.out.printf("Условная светимость: %.2f%n", sun.getLuminosity());
    }
}
