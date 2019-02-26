package prWeek7.ex7;

public class Transporter {
    public boolean canTranspose(Integer celebrities, Integer type1, Integer type2){
        int vehicle2 = 0;
        while (celebrities-vehicle2*5>4 && vehicle2<type2){
            vehicle2++;
        }
        return type1 >= celebrities-vehicle2*5;
    }
}
