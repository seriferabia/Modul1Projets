package prWeek2.exercise1;


import prWeek2.exercise1.gatherer.Gatherer;

import java.util.List;

public class Hike {

    private List<Hiker> hikers;



    Gatherer gatherer = new Gatherer();
    List<Hiker> listOfHikers = gatherer.signUp();

    public void showHikers(List<Hiker> listOfHikers){
        System.out.println(listOfHikers);
    }

}
