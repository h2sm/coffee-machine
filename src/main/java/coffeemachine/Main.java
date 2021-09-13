package coffeemachine;

import coffeemachine.controls.Machine;
import coffeemachine.controls.MachineImpl;
import coffeemachine.drinks.Drink;
import coffeemachine.internals.*;
import coffeemachine.logics.Keypad;
import coffeemachine.logics.OrderDrinks;
import coffeemachine.logics.Requests;


public class Main {
    private static final OrderDrinks order = new OrderDrinks();

    public static void main(String[] args) {
        try {
            var machine = new MachineImpl(new Boiler(), new Grinder(), new Mixer(), new PaymentControl(), new Pump());
            machine.checkMachine();
            var item = showOptions();
            var chosenDrink = order.chooseDrink(item);
            System.out.println("You chose " + chosenDrink.returnPrice() + " - " + chosenDrink.returnName());
            chosenDrink = Requests.offerSugar(chosenDrink);
            chosenDrink = Requests.offerMilk(chosenDrink);
            machine.receiveOrder(chosenDrink);
            machine.takeMoney();
            machine.prepareWater();
            machine.grind();
            machine.mix();
            machine.returnCoffee();


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry, an exception: " + e.getMessage());
        }
    }

    public static int showOptions() {
        System.out.println("Coffee machine emulator. Select what to drink: [1-4]");
        order.showAllOptions()
                .forEach(drink -> System.out.println(drink.returnName() + " costs " + drink.returnPrice()));
        return Integer.parseInt(Keypad.getLine());
    }
}