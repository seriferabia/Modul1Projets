package prWeek11.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Directions3 {

    public List<String> simplifyDirections(List<String> directions){
        List<String> cancellations = new ArrayList<>(Arrays.asList("NORTHSOUTH","SOUTHNORTH","EASTWEST","WESTEAST"));
        int position = 0;
        while (position < directions.size()-1) {
            String cancellationPair = directions.get(position)+directions.get(position+1);
            if(cancellations.contains(cancellationPair)){
                directions.remove(position);
                directions.remove(position);
                if(position!=0) position--;
            }else {
                position++;
            }
        }
        return directions;
    }
}
