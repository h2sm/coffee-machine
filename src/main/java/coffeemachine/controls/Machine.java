package coffeemachine.controls;

public interface Machine {
    void checkMachine();
    void takeMoney();
    void prepareWater();
    void grind();
    void mix();
    void returnCoffee();
}
