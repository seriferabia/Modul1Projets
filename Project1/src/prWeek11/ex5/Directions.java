package prWeek11.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Directions {

    public List<String> simplifyDirections(List<String> directions){
        directions = cancel(directions);
        while (!directions.equals(cancel(directions))){
            directions=cancel(directions);
        }
        return directions;
    }

    private List<String> cancel(List<String> directions){
        List<String> cancellations = new ArrayList<>(Arrays.asList("NORTHSOUTH","SOUTHNORTH","EASTWEST","WESTEAST"));
        for (int position = 0; position < directions.size()-1; position++) {
            String cancellationPair = directions.get(position)+directions.get(position+1);
            if(cancellations.contains(cancellationPair)){
                directions.remove(position+1);
                directions.remove(position);
                position--;
            }
        }
        return directions;
    }
}
