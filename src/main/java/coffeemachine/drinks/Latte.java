package coffeemachine.drinks;

public class Latte implements Drink{
    private int basePrice = 150;
    private String drinkName = "Latte";
    @Override
    public String returnName() {
        return drinkName;
    }

    @Override
    public int returnPrice() {
        return basePrice;
    }
}
