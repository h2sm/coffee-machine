package coffeemachine.addons;

import coffeemachine.addons.Addons;
import coffeemachine.drinks.Drink;

public class Sugar implements Addons {
    private Drink drink;

    public Sugar(Drink drink){
        this.drink = drink;
    }

    @Override
    public String returnName() {
        return drink.returnName() + " + sugar";
    }

    @Override
    public int returnPrice() {
        return drink.returnPrice() + 20;
    }

    @Override
    public int getTemperature() {
        return drink.getTemperature();
    }
}
