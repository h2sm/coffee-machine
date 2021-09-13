package coffeemachine.controls;

import coffeemachine.internals.*;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class MachineImpl implements Machine {
    private Device boiler, grinder, mixer, paymentControl, pump;

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
        for (Class<? extends Device> class1 : classes)
            class1.getDeclaredMethod("checkInternal")
                    .invoke(class1.getDeclaredConstructor().newInstance());
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
