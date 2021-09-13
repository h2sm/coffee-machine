package coffeemachine.internals;

public class Boiler extends Device{
    @Override
    public boolean checkInternal() throws Exception {
        return super.checkInternal();
    }

    @Override
    public void start() {
        System.out.println("Started boiling water.");
    }

    @Override
    public void stop() {
        System.out.println("Boiler turned off.");
    }
}
