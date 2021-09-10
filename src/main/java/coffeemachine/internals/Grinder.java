package coffeemachine.internals;

public class Grinder extends Device {

    public boolean checkGrinder() throws Exception {
        return super.checkInternal();
    }

    @Override
    public void start() {
        System.out.println("Grinding coffee beans.Zhhhhhh.....");
    }
}
