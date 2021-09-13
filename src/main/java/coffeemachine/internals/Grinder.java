package coffeemachine.internals;

import coffeemachine.drinks.Drink;

public class Grinder extends Device {

    @Override
    public boolean checkInternal() throws Exception {
        var check = super.checkInternal();
        System.out.println("Grinder working - " + check);
        return super.checkInternal();
    }

    @Override
    public void start(Drink drink) {
        System.out.println("Grinding coffee beans for " + drink.returnName() + ".Zhhhhhh.....");
    }

    @Override
    public void stop() {
        System.out.println("Grinder turned off.");
    }
}
