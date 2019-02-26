package prWeek2.exercise1.gatherer;


import prWeek2.exercise1.Hiker;

import java.util.ArrayList;
import java.util.List;

public class AutomaticGatherer {

     List<Hiker> getConfirmedHikers(){

        List<Hiker> comfirmedHikers = new ArrayList<>();
        comfirmedHikers.add(new Hiker("h1"));
        comfirmedHikers.add(new Hiker("h2"));
        comfirmedHikers.add(new Hiker("h3"));
        comfirmedHikers.add(new Hiker("h4"));
        comfirmedHikers.add(new Hiker("h5"));

        return comfirmedHikers;
    }
}
