package coffeemachine.internals;

public class Mixer extends Device{

    @Override
    public boolean checkInternal() throws Exception{
        var check = super.checkInternal();
        System.out.println("Mixer working - " + check);
        return super.checkInternal();
    }

    @Override
    public void start() {
        System.out.println("Mixing up everything!");
    }

    @Override
    public void stop() {
        System.out.println("Mixer turned off");
    }
}
