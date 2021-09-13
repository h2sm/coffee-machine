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
        this.drink = drink;
    }

    @Override
    public void takeMoney() {
        paymentControl.start(drink);
    }


    @Override
    public void prepareWater() {
        boiler.start(drink);
    }

    @Override
    public void grind() {
        grinder.start(drink);
    }

    @Override
    public void mix() {
        mixer.start(drink);
    }
    public void pour(){
        pump.start(drink);
    }

    @Override
    public void returnCoffee() {
        System.out.println("Ready. Enjoy your " + drink.returnName() + " with " + drink.getTemperature() + " temperature.");

    }
}
