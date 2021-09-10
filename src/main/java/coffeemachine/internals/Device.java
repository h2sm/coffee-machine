package coffeemachine.internals;

public abstract class Device {

    public boolean checkInternal() throws Exception {
        var isWorking = Math.random() < 0.5;
        if (!isWorking) throw new Exception("Some device is broken, no luck");
        else return isWorking;//симуляция работы какого-то компонента. мало ли, вдруг не работает штука какая-то, добавлю реализма
    }

    public void start(){}
}
