package coffeemachine.internals;

public class Pump extends Device{

    @Override
    public boolean checkInternal()  {
        return super.checkInternal();
    }

    @Override
    public void start() {
        System.out.println("Pumping liquids to a mug.");
    }

    @Override
    public void stop() {

    }
}
