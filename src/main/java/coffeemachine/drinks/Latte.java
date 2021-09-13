package coffeemachine.drinks;

public class Latte implements Drink{
    private int basePrice = 150;
    private String drinkName = "Latte";
    private int temperature = 91;
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
