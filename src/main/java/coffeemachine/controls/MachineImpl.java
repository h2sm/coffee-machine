package coffeemachine.controls;

import coffeemachine.drinks.Drink;
import coffeemachine.internals.*;
import org.reflections.Reflections;

public class MachineImpl implements Machine {
    private Device boiler, grinder, mixer, paymentControl, pump;
    private Drink drink;

    public MachineImpl(Boiler boiler, Grinder grinder, Mixer mixer, PaymentControl paymentControl, Pump pump) {
        this.boiler = boiler;
        this.grinder = grinder;
        this.mixer = mixer;
        this.paymentControl = paymentControl;
        this.pump = pump;
    }

    public void checkMachine() throws Exception {//через рефлексию вызываю метод проверки оборудования.
        //просто вызывать 5 раз один и тот же метод - не очень выглядит
        var classes = new Reflections("coffeemachine.internals").getSubTypesOf(Device.class);
        for (Class<? extends Device> innerClass : classes)
            innerClass.getDeclaredMethod("checkInternal").invoke(innerClass.getDeclaredConstructor().newInstance());
    }

    @Override
    public void receiveOrder(Drink drink) {

    }

    @Override
    public void takeMoney(int sum) {

    }


    @Override
    public void prepareWater() {
        boiler.start();
    }

    @Override
    public void grind() {
        grinder.start();
    }

    @Override
    public void mix() {
        mixer.start();
    }

    @Override
    public void returnCoffee() {

    }
}
