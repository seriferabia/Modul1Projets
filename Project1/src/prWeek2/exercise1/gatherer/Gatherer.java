package prWeek2.exercise1.gatherer;


import prWeek2.exercise1.Hiker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gatherer {

    public List<Hiker> signUp(){

        List<Hiker> hikers = new ArrayList<>();

        System.out.println("Hello! What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        while(!name.isEmpty()){
            Hiker hiker = new Hiker(name);
            hikers.add(hiker);
            System.out.println("Hello! What is your name?");
            name = scanner.nextLine();

        }

        AutomaticGatherer automaticGatherer = new AutomaticGatherer();
        List<Hiker> confirmedHikers = automaticGatherer.getConfirmedHikers();

        for (Hiker hiker:confirmedHikers ) {
            hikers.add(hiker);

        }

        return hikers;
    }
}
