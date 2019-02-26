package prWeek5.ex6;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe implements Furniture {
    private List<String> parts = new ArrayList<>();

    @Override
    public void add(String part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        return "Wardeobe parts=" + parts ;
    }

    public List<String> getParts(){
        return parts;
    }
}
