package coffeemachine.addons;

import coffeemachine.drinks.Drink;

public interface Addons extends Drink {
    String returnName();
    int returnPrice();
}
