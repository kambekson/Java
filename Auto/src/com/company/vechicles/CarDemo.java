package com.company.vechicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class CarDemo {
    public static void main(String[] args) {
        Driver bmwDriver = new Driver("Аталин С.", 19, false, 1);
        Engine bmwEngine = new Engine("450", "BMW");
        Car car = new Car("BMW", "C", 2400, bmwDriver, bmwEngine);

        Driver lorryDriver = new Driver("Петров В.В.", 45, false, 20);
        Engine lorryEngine = new Engine("30", "LorryEngine");
        Lorry lorry = new Lorry("Грузовик", "D", 8000, lorryDriver, lorryEngine, 70);

        Driver sportDriver = new Driver("Аргынгазы", 19, false, 1);
        Engine sportEngine = new Engine("600", "Audi");
        SportCar sportCar = new SportCar("Audi", "S", 2000, sportDriver, sportEngine, 300);

        System.out.println(car);
        System.out.println("\n");
        System.out.println(lorry);
        System.out.println("\n");
        System.out.println(sportCar);
    }
}