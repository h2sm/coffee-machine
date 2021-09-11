package coffeemachine;

import coffeemachine.addons.Milk;
import coffeemachine.addons.Sugar;
import coffeemachine.controls.MachineImpl;
import coffeemachine.drinks.Drink;
import coffeemachine.internals.Device;
import coffeemachine.settings.Init;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Drink> coffeeList;
    private static ArrayList<Device> devices;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            init();
            var machine = new MachineImpl(devices);
            System.out.println("Checking systems....");
            machine.checkMachine();
            System.out.println("Everything works correctly.");
            System.out.println("Coffee machine emulator. Select what to drink: [1-4]");
            coffeeList.forEach(drink -> System.out.println("Position: " + drink.returnName()));
            var position = Integer.parseInt(scanner.nextLine()) - 1;
            var chosenDrink = coffeeList.get(position);
            System.out.println(chosenDrink.returnPrice() + " - " + chosenDrink.returnName());
            System.out.println("Add sugar? Y/N");
            if (scanner.nextLine().equals("Y")) {
                chosenDrink = new Sugar(chosenDrink);
                System.out.println(chosenDrink.returnPrice() + " - " + chosenDrink.returnName());
            }
            System.out.println("Add milk? Y/N");
            if (scanner.nextLine().equals("Y")) {
                chosenDrink = new Milk(chosenDrink);
                System.out.println(chosenDrink.returnPrice() + " - " + chosenDrink.returnName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void init() {
        coffeeList = Init.makeList();
        devices = Init.makeDevicesList();
    }
}
