package coffeemachine;

import coffeemachine.addons.Milk;
import coffeemachine.addons.Sugar;
import coffeemachine.controls.MachineImpl;
import coffeemachine.drinks.Drink;
import coffeemachine.internals.Device;
import coffeemachine.logics.OrderDrinks;
import coffeemachine.settings.Init;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Device> devices;
    private static Scanner scanner = new Scanner(System.in);
    private static final OrderDrinks order = new OrderDrinks();

    public static void main(String[] args) {
        // TODO: 11.09.2021 раскидать все по классам, метод слишком много делает + дописать логику машины 
        try {
            init();
            var machine = new MachineImpl(devices);
            System.out.println("Checking systems....");
            machine.checkMachine();
            System.out.println("Everything works correctly.");
            System.out.println("Coffee machine emulator. Select what to drink: [1-4]");
            var list = order.showAllOptions();
            list.forEach(drink -> System.out.println("Position: " + drink.returnName()));
            var position = Integer.parseInt(scanner.nextLine()) - 1;
            var chosenDrink = order.chooseDrink(position);
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
        devices = Init.makeDevicesList();
    }
}
