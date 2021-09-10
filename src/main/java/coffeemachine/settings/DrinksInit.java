package coffeemachine.settings;

import coffeemachine.drinks.*;

import java.util.ArrayList;

public class DrinksInit {
    public static ArrayList <Drink> makeList(){
        var coffeeList = new ArrayList<Drink>();
        coffeeList.add(new Americano());
        coffeeList.add(new Espresso());
        coffeeList.add(new Latte());
        coffeeList.add(new Russiano());
        return coffeeList;
    }
}
