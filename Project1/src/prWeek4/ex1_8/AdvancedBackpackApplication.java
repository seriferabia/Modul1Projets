package prWeek4.ex1_8;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

public class AdvancedBackpackApplication {
    public static void main(String[] args) {
        Set<Item> backpack = new HashSet<>();
        System.out.println(backpack);
        Item towel = new Item("towel");
        backpack.add(towel);
        backpack.add(new Item("toothbrush"));
        backpack.add(new Item("blouse"));
        System.out.println(backpack);
        Item newOne = new Item("towel");
        boolean isTowelThere = backpack.contains(newOne);
        System.out.println("Is towel there? " +isTowelThere);
        backpack.remove(newOne);
        System.out.println(backpack);
        isTowelThere = backpack.contains(newOne);
        System.out.println("Let's check again! Is towel still there? " + isTowelThere);
        backpack.add(new Item("blouse"));
        backpack.add(new Item("blouse"));
        System.out.println(backpack);
        System.out.println("Size of backpack is " +backpack.size());

    }
    public static class Item{
        private String name;

        public Item(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "name=" + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Item item = (Item) o;
            return Objects.equals(name, item.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
