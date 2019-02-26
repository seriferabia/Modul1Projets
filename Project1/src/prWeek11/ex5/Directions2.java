package prWeek11.ex5;

import java.util.List;

public class Directions2 {
    public static List<String> dirReduc(List<String> directions) {
        directions = cancel(directions);
        while (!directions.equals(cancel(directions))){
            directions=cancel(directions);
        }
        return directions;
    }

    private static List<String> cancel(List<String> directions){
        int position = 0;
        while (position < directions.size()-1) {
            if(isOpposite(directions.get(position),directions.get(position+1))){
                directions.remove(position);
                directions.remove(position);
            }else{
                position++;
            }
        }
        return directions;
    }

    private static Boolean isOpposite(String direction1, String direction2) {
        Boolean condition1 = direction1.equalsIgnoreCase("north") && direction2.equalsIgnoreCase("south")
                || direction1.equalsIgnoreCase("south") && direction2.equalsIgnoreCase("north");
        Boolean condition2 = direction1.equalsIgnoreCase("west") && direction2.equalsIgnoreCase("east")
                || direction1.equalsIgnoreCase("east") && direction2.equalsIgnoreCase("west");
        if(condition1||condition2){
            return true;
        }
        return false;
    }
}
