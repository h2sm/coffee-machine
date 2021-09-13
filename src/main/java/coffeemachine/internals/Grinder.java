package coffeemachine.internals;

public class Grinder extends Device {

    @Override
    public boolean checkInternal() throws Exception {
        var check = super.checkInternal();
        System.out.println("Grinder working - " + check);
        return super.checkInternal();
    }

    @Override
    public void start() {
        System.out.println("Grinding coffee beans.Zhhhhhh.....");
    }

    @Override
    public void stop() {
        System.out.println("Grinder turned off.");
    }
}
