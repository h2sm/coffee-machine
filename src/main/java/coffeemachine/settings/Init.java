package coffeemachine.settings;

import coffeemachine.drinks.*;
import coffeemachine.internals.*;

import java.util.ArrayList;

public class Init {
    public static ArrayList <Drink> makeList(){
        var coffeeList = new ArrayList<Drink>();
        coffeeList.add(new Americano());
        coffeeList.add(new Espresso());
        coffeeList.add(new Latte());
        coffeeList.add(new Russiano());
        return coffeeList;
    }
}
