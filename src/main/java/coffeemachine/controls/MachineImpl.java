package coffeemachine.controls;
import coffeemachine.internals.*;
import java.util.ArrayList;

public class MachineImpl implements Machine {
    private ArrayList<Device> devices;

    public MachineImpl(ArrayList<Device> devices) {
        this.devices = devices;
    }

    public void checkMachine() throws Exception {
        for (int i = 0; i < devices.size(); i++) devices.get(i).checkInternal();
    }

    @Override
    public void takeMoney() {
        System.out.println("Received a sum.");
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
