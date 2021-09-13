package coffeemachine.drinks;

public class Americano implements Drink{
    private int basePrice = 210;
    private String drinkName = "Americano";
    private int temperature = 90;

    @Override
    public String returnName() {
        return drinkName;
    }

    @Override
    public int returnPrice() {
        return basePrice;
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}

