package coffeemachine.internals;

import coffeemachine.drinks.Drink;

public class Boiler extends Device{
    @Override
    public boolean checkInternal() throws Exception {
        return super.checkInternal();
    }

    @Override
    public void start(Drink drink) {
        System.out.println("Started boiling water for " + drink.returnName() + " with temperature of " + drink.getTemperature());
    }

    @Override
    public void stop() {
        System.out.println("Boiler turned off.");
    }
}
