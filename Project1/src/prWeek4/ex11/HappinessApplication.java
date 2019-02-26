package prWeek4.ex11;


import prWeek4.ex9.FileReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessApplication {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        List<String> lines = fileReader.getLines("prWeek4/ex11/world-happiness-2017.csv");
        List<HappinessRecord> recordList = getHappinessRecord(lines);
        List<HappinessRecord> firstFiveCountry = getFirstFive(recordList);
        firstFiveCountry.forEach(System.out::println);


    }

    private static List<HappinessRecord> getFirstFive(List<HappinessRecord> recordList) {
        Collections.sort(recordList, Comparator.comparing(HappinessRecord::getRank));
        List<HappinessRecord> firstFive = new ArrayList<>();
        for(int position = 0; position<5; position++){
            firstFive.add(recordList.get(position));
        }
        return firstFive;
    }

    private static List<HappinessRecord>  getHappinessRecord(List<String> lines) {
        lines.remove(0);
        List<HappinessRecord> recordList = new ArrayList<>();
        for (String line : lines) {
            String[] split = line.split(";");
            String country = split[0];
            Integer rank = Integer.valueOf(split[1]);
            Double score = Double.valueOf(split[2]);
            HappinessRecord happinessRecord = new HappinessRecord(country,rank,score);
            recordList.add(happinessRecord);
        }
        return recordList;
    }
}
