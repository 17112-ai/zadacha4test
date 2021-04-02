package DamqnTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car("BMW", "530d", 4, 4);
        Truck truck = new Truck("Man", "TGX", 6, 40);

        car.printInfo();

        System.out.println();

        truck.printInfo();
    }
}
