package prWeek7.ex8;

public class IntIterator {
    public Integer getIntegerValue(String character){
        if(character.equalsIgnoreCase("M")){
            return 1000;
        }if(character.equalsIgnoreCase("D")){
            return 500;
        }if(character.equalsIgnoreCase("C")){
            return 100;
        }if(character.equalsIgnoreCase("L")){
            return 50;
        }if(character.equalsIgnoreCase("X")){
            return 10;
        }if(character.equalsIgnoreCase("V")){
            return 5;
        }if(character.equalsIgnoreCase("I")){
            return 1;
        }
        return 0;
    }
}
