package coffeemachine.controls;

public interface Machine {
    void checkMachine() throws Exception;
    void takeMoney();
    void prepareWater();
    void grind();
    void mix();
    void returnCoffee();
}
