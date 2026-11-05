package org.example;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[]{
                new Computer("Lenovo", "Ryzen 5", 16),
                new Computer("Asus", "Core i5", 8),
                new Computer("Acer", "Core i7", 32),
                new Computer("HP", "Ryzen 7", 16),
                new Computer("MSI", "Core i9", 64)
        };

        for (Computer computer : computers) {
            System.out.printf("%s, %s, %d ГБ%n",
                    computer.getBrand(), computer.getProcessor(), computer.getRam());
        }

        System.out.printf("Всего компьютеров: %d%n", Computer.getTotalComputers());
        System.out.printf("Средняя память: %.1f ГБ%n", Computer.getAverageRAM());
    }
}
