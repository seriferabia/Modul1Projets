package prWeek2.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public List<Meal> getMealsAtMenu(){
        List<Meal> menu = new ArrayList<>();
        menu.add(new Meal("couscous", 8.5) );
        menu.add(new Meal("tajin", 9.5) );
        menu.add(new Meal("hummus", 3.5) );
        menu.add(new Meal("falafel", 4.0) );

        return menu;

    }


}
