package prWeek4.ex9;

import java.util.List;

public class LoremIpsumApplication {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        List<String> lines = fileReader.getLines("prWeek4/ex9/lorem-ipsum.txt");
        lines.forEach(System.out::println);
    }
}
