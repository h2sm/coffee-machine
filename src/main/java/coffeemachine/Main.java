package coffeemachine;
import coffeemachine.controls.MachineImpl;
import coffeemachine.drinks.Drink;
import coffeemachine.internals.Grinder;
import coffeemachine.internals.Mixer;
import coffeemachine.internals.PaymentControl;
import coffeemachine.internals.Pump;
import coffeemachine.settings.DrinksInit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var coffeeList= DrinksInit.makeList();
        var machine = new MachineImpl(new Grinder(), new Mixer(), new PaymentControl(), new Pump());
        System.out.println("Coffee machine emulator. Select what to drink: [1-4]");
        var scanner = new Scanner(System.in);
        var position = Integer.parseInt(scanner.nextLine());

    }

}
