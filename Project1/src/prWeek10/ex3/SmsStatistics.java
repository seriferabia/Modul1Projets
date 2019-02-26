package prWeek10.ex3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsStatistics {
    private List<String> smsList = new SMS().getSmsList();

    public List<String> getRatioBetweenHamAndSpam() {
        Map<String, Long> numbersOfHamAndSpam = smsList.stream()
                .skip(1)
                .map(e -> e.split(";")[0])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Long total = numbersOfHamAndSpam.entrySet()
                .stream()
                .map(e -> e.getValue())
                .reduce((long) 0, (e1, e2) -> e1 + e2);
        List<String> results = numbersOfHamAndSpam.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " is " + e.getValue() * 100 / total + "%")
                .collect(Collectors.toList());
        return results;

    }

    public String getMostUsedHamWord() {
        return smsList.stream()
                .skip(1)
                .filter(e -> e.split(";")[0].equals("ham"))
                .flatMap(e -> Stream.of(e.split(" ")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst().get().getKey();
    }

    public String getMostUsedHamLetter() {
        return smsList.stream()
                .skip(1)
                .filter(e -> e.split(";")[0].equals("ham"))
                .flatMap(e -> Stream.of(e.split(" ")))
                //.map(e->e.replaceAll("[,\\.]",""))
                .flatMap(e -> Stream.of(e.split("")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst().get().getKey();
    }

    public Integer numberOfLongestSpamMessage(){
        return smsList.stream()
                .skip(1)
                .filter(e -> e.split(";")[0].equals("spam"))
                .map(e -> e.split(";")[1].length())
                .sorted(Comparator.reverseOrder())
                .findFirst().get();
    }

}
