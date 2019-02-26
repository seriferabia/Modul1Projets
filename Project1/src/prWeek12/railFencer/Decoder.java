package prWeek12.railFencer;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class Decoder {
    private CoordinateCalculator calculator = new CoordinateCalculator();

    public String decode(String encodedText, Integer numberOfRows){
        List<Coordinate> sortedCoordinates = calculator.sortedCoordinatesOfLetters(encodedText, numberOfRows);
        HashMap<Integer,Character> lettersCoordinates = new HashMap<>();
        for (int position=0;position<encodedText.length();position++) {
            lettersCoordinates.put(sortedCoordinates.get(position).getColumn(),encodedText.charAt(position));
        }
        return lettersCoordinates.entrySet().stream()
                .map(e->e.getValue().toString())
                .collect(Collectors.joining());
    }
}