package coffeemachine;

import coffeemachine.addons.Milk;
import coffeemachine.addons.Sugar;
import coffeemachine.controls.Machine;
import coffeemachine.controls.MachineImpl;
import coffeemachine.drinks.Drink;
import coffeemachine.internals.*;
import coffeemachine.logics.OrderDrinks;
import coffeemachine.settings.Init;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Device> devices = Init.makeDevicesList();
    private static Scanner scanner = new Scanner(System.in);
    private static final OrderDrinks order = new OrderDrinks();

    public static void main(String[] args) {
        // TODO: 13.09.2021 добавь "эквайринг". ну или хотя бы чтобы сумму можно было ввести типа заплатил
        try {
            var machine = new MachineImpl(new Boiler(), new Grinder(), new Mixer(), new PaymentControl(), new Pump());
            machine.checkMachine();
            var item = selectItem();
            var chosenDrink = order.chooseDrink(item);
            System.out.println("You chose " + chosenDrink.returnPrice() + " - " + chosenDrink.returnName());
            chosenDrink = requestSugar(chosenDrink);
            chosenDrink = requestMilk(chosenDrink);
            System.out.println(chosenDrink.returnName() + ": please pay " + chosenDrink.returnPrice());
            System.out.println("**Do nothing**");
            Thread.sleep(300);


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry, an exception: " + e.getMessage());
        }

    }

    public static void check(Machine machine) throws Exception {
        System.out.println("Checking systems....");
        machine.checkMachine();
        System.out.println("Everything works correctly.");
    }

    public static int selectItem() {
        System.out.println("Coffee machine emulator. Select what to drink: [1-4]");
        order.showAllOptions()
                .forEach(drink ->
                        System.out.println(drink.returnName() + " costs " + drink.returnPrice()));
        return Integer.parseInt(scanner.nextLine());
    }

    public static Drink requestSugar(Drink drink) {
        System.out.println("Add sugar? (+20 rub) Y/N");
        if (scanner.nextLine().equals("Y")) {
            drink = order.addSugar(drink);
            return drink;
        } else return drink;
    }

    public static Drink requestMilk(Drink drink) {
        System.out.println("Add milk? (+30 rub) Y/N");
        if (scanner.nextLine().equals("Y")) {
            drink = order.addMilk(drink);
            return drink;
        } else return drink;
    }
}