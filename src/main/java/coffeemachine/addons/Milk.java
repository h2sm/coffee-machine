package coffeemachine.addons;

import coffeemachine.addons.Addons;
import coffeemachine.drinks.Drink;

public class Milk implements Addons {
    private Drink drink;

    public Milk(Drink drink){
        this.drink = drink;
    }
    @Override
    public String returnName() {
        return drink.returnName() + " + Milk";
    }

    @Override
    public int returnPrice() {
        return drink.returnPrice() + 30;
    }
}
