package coffeemachine.internals;

import coffeemachine.drinks.Drink;
import coffeemachine.logics.Keypad;

public class PaymentControl extends Device{
    @Override
    public boolean checkInternal() throws Exception {
        var check = super.checkInternal();
        System.out.println("Payment working - " + check);
        return super.checkInternal();
    }

    @Override
    public void start(Drink drink) {
        System.out.println("Please pay (just enter a price)" + drink.returnPrice());
        int price = Integer.parseInt(Keypad.getLine());
        if (price>=drink.returnPrice()) System.out.println("Payment received");
        else {
            System.out.println("Not enough money. Return when you earn money...");
            System.exit(0);
        }
    }

    @Override
    public void stop() {
        System.out.println("Payment panel turned off");
    }
}