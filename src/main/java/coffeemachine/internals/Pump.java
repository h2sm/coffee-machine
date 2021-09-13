package coffeemachine.internals;

import coffeemachine.drinks.Drink;

public class Pump extends Device{

    @Override
    public boolean checkInternal() throws Exception {
        var check = super.checkInternal();
        System.out.println("Pump working - " + check);
        return super.checkInternal();
    }

    @Override
    public void start(Drink drink) {
        System.out.println("Pumping liquids to a mug.");
    }

    @Override
    public void stop() {
        System.out.println("Pump turned off.");
    }
}
