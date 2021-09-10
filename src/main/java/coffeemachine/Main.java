package coffeemachine;
import coffeemachine.controls.MachineImpl;
import coffeemachine.internals.Grinder;
import coffeemachine.internals.Mixer;
import coffeemachine.internals.PaymentControl;
import coffeemachine.internals.Pump;
import coffeemachine.settings.Init;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var coffeeList= Init.makeList();
        var devicesList = Init.makeDevicesList();
        var machine = new MachineImpl(devicesList);
        System.out.println("Coffee machine emulator. Select what to drink: [1-4]");
        var scanner = new Scanner(System.in);
        var position = Integer.parseInt(scanner.nextLine());

    }

}
