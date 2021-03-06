package coffeemachine.controls;

import coffeemachine.drinks.Drink;

public interface Machine {
    void checkMachine() throws Exception;
    void receiveOrder(Drink drink);
    void takeMoney();
    void prepareWater();
    void grind();
    void mix();
    void pour();
    void returnCoffee();
}
