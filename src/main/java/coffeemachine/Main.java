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
    private static final ArrayList<Device> devices = Init.makeDevicesList();
    private static Scanner scanner = new Scanner(System.in);
    private static final OrderDrinks order = new OrderDrinks();

    public static void main(String[] args) {
        // TODO: 11.09.2021 раскидать все по классам, метод слишком много делает + дописать логику машины 
        try {
            var machine = new MachineImpl(devices);
            System.out.println("Checking systems....");
            machine.checkMachine();
            System.out.println("Everything works correctly.");
            System.out.println("Coffee machine emulator. Select what to drink: [1-4]");
            order.showAllOptions()
                    .forEach(drink ->
                            System.out.println(drink.returnName() + " costs " + drink.returnPrice()));
            //
            var position = Integer.parseInt(scanner.nextLine());
            var chosenDrink = order.chooseDrink(position);
            System.out.println("You chose " + chosenDrink.returnPrice() + " - " + chosenDrink.returnName());
            System.out.println("Add sugar? Y/N");
            if (scanner.nextLine().equals("Y")) {
                chosenDrink = order.addSugar(chosenDrink);
                System.out.println(chosenDrink.returnPrice() + " - " + chosenDrink.returnName());
            }
            System.out.println("Add milk? Y/N");
            if (scanner.nextLine().equals("Y")) {
                chosenDrink = order.addMilk(chosenDrink);
                System.out.println(chosenDrink.returnPrice() + " - " + chosenDrink.returnName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
