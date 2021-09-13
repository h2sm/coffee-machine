package coffeemachine.controls;

import coffeemachine.drinks.Drink;

public interface Machine {
    void checkMachine() throws Exception;
    void receiveOrder(Drink drink);
    boolean takeMoney(int sum);
    void prepareWater();
    void grind();
    void mix();
    void returnCoffee();
}
