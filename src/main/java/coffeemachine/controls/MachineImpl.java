package coffeemachine.controls;

import coffeemachine.internals.*;

import java.util.ArrayList;

public class MachineImpl implements Machine  {

    private ArrayList<Device> devices;
    public MachineImpl(ArrayList<Device> devices) {
        this.devices = devices;
    }


    public boolean checkMachine() {
        devices.forEach(Device::checkInternal);
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
