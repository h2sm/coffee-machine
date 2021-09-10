package coffeemachine.controls;

public interface Machine {
    boolean checkMachine() throws Exception;
    void takeMoney();
    void prepareWater();
    void grind();
    void mix();
    void returnCoffee();
}
