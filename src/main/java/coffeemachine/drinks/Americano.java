package coffeemachine.drinks;

public class Americano implements Drink{
    private int basePrice = 210;
    private String drinkName = "Americano";

    @Override
    public String returnName() {
        return drinkName;
    }

    @Override
    public int returnPrice() {
        return basePrice;
    }
}
