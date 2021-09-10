package coffeemachine;

import coffeemachine.drinks.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var list= init();
        System.out.println("Coffee machine emulator. Select what to drink [1-4]");

    }
    private static ArrayList<Drink> init(){
        var coffeeList = new ArrayList<Drink>();
        coffeeList.add(new Americano());
        coffeeList.add(new Espresso());
        coffeeList.add(new Latte());
        coffeeList.add(new Russiano());
        return coffeeList;
    }
}
