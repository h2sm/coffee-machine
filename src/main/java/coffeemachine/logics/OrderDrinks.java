package coffeemachine.logics;

import coffeemachine.addons.Milk;
import coffeemachine.addons.Sugar;
import coffeemachine.drinks.Drink;
import coffeemachine.settings.Init;

import java.util.ArrayList;

public class OrderDrinks implements Order {
    private final ArrayList<Drink> drinks = Init.makeList();

    @Override
    public Drink chooseDrink(int number) throws Exception {
        number = number - 1;
        if (number <=drinks.size()) return drinks.get(number);
        else throw new Exception("There is no such a drink");
    }

    @Override
    public Drink addSugar(Drink drink) {
        System.out.println("Add sugar? (+20 rub) Y/N");
        if (Keypad.getLine().equals("Y")) drink = new Sugar(drink);
        return drink;
    }

    @Override
    public Drink addMilk(Drink drink) {
        System.out.println("Add milk? (+30 rub) Y/N");
        if (Keypad.getLine().equals("Y")) drink = new Milk(drink);
        return drink;
    }

    @Override
    public ArrayList<Drink> showAllOptions() {
        return drinks;
    }
}
