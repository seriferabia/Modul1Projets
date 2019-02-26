package prWeek9.ex4;

import prWeek9.FileReader;

import java.util.Comparator;
import java.util.function.Function;

public class HappinessApp {

    public static void main(String[] args) {
         new FileReader().asStream("prWeek9/source/world-happiness-2017.csv")
                .skip(1)
                .map(line->line.split(";"))
                .map(e->new HappinessRecord(e[0],Integer.valueOf(e[1]),Double.valueOf(e[2])))
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(5)
                .forEach(System.out::println);
    }

//    public static void main(String[] args) {
//        fileReader.asStream("prWeek9/source/world-happiness-2017.csv")
//                .skip(1)
//                .map(line -> line.split(";"))
//                .map(toHappinessRecord())
//                .sorted(Comparator.comparing(HappinessRecord::getRank))
//                .limit(5)
//                .forEach(System.out::println);
//    }
//
//    private static Function<String[], HappinessRecord> toHappinessRecord() {
//        return columns-> new HappinessRecord(
//                columns[0],
//                Integer.valueOf(columns[1]),
//                Double.valueOf(columns[2])
//        );
//    }

}
