package coffeemachine.logics;

import coffeemachine.drinks.Drink;

public class Requests {
    private static final OrderDrinks order = new OrderDrinks();

    public static Drink offerSugar(Drink drink){
        System.out.println("Add sugar? (+20 rub) Y/N");
        if (Keypad.getLine().equals("Y")) {
            drink = order.addSugar(drink);
            return drink;
        } else return drink;
    }
    public static Drink offerMilk(Drink drink){
        System.out.println("Add milk? (+30 rub) Y/N");
        if (Keypad.getLine().equals("Y")) {
            drink = order.addMilk(drink);
            return drink;
        } else return drink;
    }

}
