package coffeemachine.logics;

import coffeemachine.drinks.Drink;

import java.util.ArrayList;

public interface Order {
    Drink chooseDrink(int number) throws Exception;
    Drink addSugar(Drink drink);
    Drink addMilk(Drink drink);
    ArrayList<Drink> showAllOptions();
}
