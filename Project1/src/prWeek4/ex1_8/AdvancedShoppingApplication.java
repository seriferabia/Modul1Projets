package prWeek4.ex1_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {
        List<Grocery> groceries = new ArrayList<>();
        System.out.println(groceries);
        Grocery banana = new Grocery("banana");
        groceries.add(banana);
        groceries.add(new Grocery("strawberry"));
        groceries.add(new Grocery("kiwi"));
        System.out.println(groceries);
        Grocery newGrocery = new Grocery("banana");
        groceries.remove(newGrocery);
        System.out.println(groceries);
        groceries.addAll(Arrays.asList(new Grocery("strawberry"),new Grocery("strawberry")));
        System.out.println(groceries);
        groceries.remove(2);
        System.out.println(groceries);
        System.out.println("Groceries size is " + groceries.size());
    }
    public static class Grocery{
        private String name;

        public Grocery(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "name=" + name ;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Grocery grocery = (Grocery) o;
            return Objects.equals(name, grocery.name);
        }

    }

}
