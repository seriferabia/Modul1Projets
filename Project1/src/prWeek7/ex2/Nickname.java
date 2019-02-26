package prWeek7.ex2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Nickname {
    public String getNickname(String name){
        int size = (int) name.length()/2;
        return Stream.of(name.split("")).limit(size).collect(Collectors.joining(""));
    }
}
