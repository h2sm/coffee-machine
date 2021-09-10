package coffeemachine.drinks;

public class Russiano implements Drink{
    private int basePrice = 200;
    private String drinkName = "Russiano";

    @Override
    public String returnName() {
        return drinkName;
    }

    @Override
    public int returnPrice() {
        return basePrice;
    }
}
