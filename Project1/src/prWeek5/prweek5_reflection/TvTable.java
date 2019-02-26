package prWeek5.prweek5_reflection;


import prWeek5.ex6.Furniture;

import java.util.ArrayList;
import java.util.List;

public class TvTable implements Furniture {
    private List<String> parts = new ArrayList<>();

    @Override
    public void add(String part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        return "Tv table parts=" + parts ;
    }

    public List<String> getParts(){
        return parts;
    }
}
