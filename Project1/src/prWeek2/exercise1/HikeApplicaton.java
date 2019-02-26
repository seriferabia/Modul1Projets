package prWeek2.exercise1;

import prWeek2.exercise1.gatherer.Gatherer;

import java.util.List;

public class HikeApplicaton {

    public static void main(String[] args) {

        Gatherer gatherer = new Gatherer();
        List<Hiker> hikers = gatherer.signUp();

        Hike hike = new Hike();
        hike.showHikers(hikers);


    }
}
