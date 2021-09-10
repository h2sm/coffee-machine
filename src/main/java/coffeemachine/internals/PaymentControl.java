package coffeemachine.internals;

public class PaymentControl extends Device{
    @Override
    public boolean checkInternal() throws Exception {
        var check = super.checkInternal();
        System.out.println("Payment working - " + check);
        return super.checkInternal();
    }

    @Override
    public void start() {
        System.out.println("Sum was holded");
    }

    @Override
    public void stop() {

    }
}