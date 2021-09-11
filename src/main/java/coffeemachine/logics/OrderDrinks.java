package coffeemachine.logics;

import coffeemachine.addons.Milk;
import coffeemachine.addons.Sugar;
import coffeemachine.drinks.Drink;
import coffeemachine.settings.Init;

import java.util.ArrayList;

public class OrderDrinks implements Order {
    private final ArrayList<Drink> drinks;

    public OrderDrinks() {
        drinks = Init.makeList();
    }

    @Override
    public Drink chooseDrink(int number) throws Exception {
        number = number - 1;
        if (drinks.size() <= number) return drinks.get(number);
        else throw new Exception("There is no such a drink");
    }

    @Override
    public Drink addSugar(Drink drink) {
        drink = new Sugar(drink);
        return drink;
    }

    @Override
    public Drink addMilk(Drink drink) {
        drink = new Milk(drink);
        return drink;
    }

    @Override
    public ArrayList<Drink> showAllOptions() {
        return drinks;
    }
}
