package prWeek4.reflection4;

import prWeek4.ex9.FileReader;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class RobodogApplication {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        List<String> lines = fileReader.getLines("prWeek4/reflection4/robodog.txt");
        List<String> instructions = getInstructions(lines);
        Set<String> uniqueInstructions = new HashSet<>(instructions);
        System.out.println("Number of unique instructions : "+uniqueInstructions.size());
        System.out.println("Commands : "+ uniqueInstructions);
        Map<String, Long> frequency = getFrequency(instructions);
        System.out.println("Frequency : "+ frequency);
        Map.Entry<String, Long> mostUsedInstruction = getMostUsedInstruction(frequency);
        System.out.println("The most used command is "+ mostUsedInstruction.getKey()+" | "+mostUsedInstruction.getValue()+" times");
    }
    public static Map.Entry<String, Long> getMostUsedInstruction(Map<String,Long> frequency){
        Map<String, Long> sortedActions = frequency.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return (Map.Entry<String, Long>) new ArrayList(sortedActions.entrySet()).get(0);
    }
    public static Map<String, Long> getFrequency(List<String> instructions){
        return instructions.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
    public static List<String> getInstructions(List<String> lines){
        return lines.stream().map(e->getOneInstruction(e)).collect(Collectors.toList());
    }
    private static String getOneInstruction(String line){
        return Stream.of(line.split("")).filter(e->!e.equals("!")).collect(Collectors.joining());

    }

}
