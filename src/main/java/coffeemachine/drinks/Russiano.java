package coffeemachine.drinks;

public class Russiano implements Drink{
    private int basePrice = 200;
    private String drinkName = "Russiano";
    private int temperature = 146;

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
