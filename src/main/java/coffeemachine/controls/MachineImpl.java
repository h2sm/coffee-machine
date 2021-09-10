package coffeemachine.controls;

import coffeemachine.internals.*;

public class MachineImpl implements Machine  {

    private Grinder grinder;
    private Mixer mixer;
    private PaymentControl paymentControl;
    private Pump pump;
    public MachineImpl(Grinder grinder, Mixer mixer, PaymentControl paymentControl, Pump pump) {
        this.grinder = grinder;
        this.mixer = mixer;
        this.paymentControl = paymentControl;
        this.pump = pump;
    }

    @Override
    public void checkMachine() {

    }

    @Override
    public void takeMoney() {

    }

    @Override
    public void prepareWater() {

    }

    @Override
    public void grind() {

    }

    @Override
    public void mix() {

    }

    @Override
    public void returnCoffee() {

    }
}
