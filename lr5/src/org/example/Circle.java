package org.example;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (!setRadius(radius)) {
            this.radius = 1;
        }
    }

    public double getRadius() {
        return radius;
    }

    public boolean setRadius(double radius) {
        if (radius <= 0 || radius > 100000) {
            return false;
        }

        this.radius = radius;
        return true;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
