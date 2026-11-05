package org.example;

public class Computer {
    private String brand;
    private String processor;
    private int ram;

    private static int totalComputers;
    private static int totalRAM;

    public Computer(String brand, String processor, int ram) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        totalComputers++;
        totalRAM += ram;
    }

    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public static int getTotalComputers() {
        return totalComputers;
    }

    public static double getAverageRAM() {
        if (totalComputers == 0) {
            return 0;
        }

        return (double) totalRAM / totalComputers;
    }
}
