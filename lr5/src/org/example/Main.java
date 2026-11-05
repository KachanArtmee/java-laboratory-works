package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle[] circles = new Circle[3];

        for (int i = 0; i < circles.length; i++) {
            Circle circle = new Circle(1);

            while (true) {
                System.out.printf("Введите радиус окружности %d: %n", i + 1);

                if (!sc.hasNextDouble()) {
                    System.out.printf("Радиус должен быть числом.%n");
                    sc.nextLine();
                    continue;
                }

                double radius = sc.nextDouble();
                sc.nextLine();

                if (circle.setRadius(radius)) {
                    break;
                }

                System.out.printf("Радиус должен быть больше 0 и не больше 100000.%n");
            }

            circles[i] = circle;
        }

        for (Circle circle : circles) {
            System.out.printf("Радиус: %.2f, площадь: %.2f, длина: %.2f%n",
                    circle.getRadius(), circle.area(), circle.circumference());
        }

        sc.close();
    }
}
