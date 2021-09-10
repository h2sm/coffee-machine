package coffeemachine.controls;

import coffeemachine.internals.*;

import java.util.ArrayList;

public class MachineImpl implements Machine  {

    private ArrayList<Device> devices;
    public MachineImpl(ArrayList<Device> devices) {
        this.devices = devices;
    }


    public void checkMachine() throws Exception {
        System.out.println("Checking systems....");
        for (int i = 0; i < devices.size(); i++) {
            var device = devices.get(i).checkInternal();
        }
        System.out.println("Everything works correctly.");

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
