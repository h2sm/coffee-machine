package coffeemachine;

import coffeemachine.controls.MachineImpl;
import coffeemachine.drinks.Drink;
import coffeemachine.internals.Device;
import coffeemachine.settings.Init;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static ArrayList<Drink> coffeeList;
    private static ArrayList<Device> devices;

    public static void main(String[] args) throws Exception {
        init();
        var machine = new MachineImpl(devices);
        machine.checkMachine();
        System.out.println("Coffee machine emulator. Select what to drink: [1-4]");

        var scanner = new Scanner(System.in);
        var position = Integer.parseInt(scanner.nextLine());



    }

    private static void init() {
        coffeeList = Init.makeList();
        devices = Init.makeDevicesList();
    }


}
