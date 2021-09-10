package coffeemachine.internals;

public class Grinder extends Device {

    @Override
    public boolean checkInternal()  {
        return super.checkInternal();
    }

    @Override
    public void start() {
        System.out.println("Grinding coffee beans.Zhhhhhh.....");
    }

    @Override
    public void stop() {

    }
}
