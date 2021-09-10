package coffeemachine.drinks;

public class Espresso implements Drink{
    private int basePrice = 140;
    private String drinkName = "Espresso";

    @Override
    public String returnName() {
        return drinkName;
    }

    @Override
    public int returnPrice() {
        return basePrice;
    }
}
