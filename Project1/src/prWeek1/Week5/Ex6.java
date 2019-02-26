package Week5;

import static Week4.Main.getANumber;

public class Ex6 {
    public static void main(String[] args) {
        int celebrities = getANumber();
        int type1Car = getANumber();
        int type2Car = getANumber();

        if(canTranspose(celebrities, type1Car, type2Car)){
            System.out.println("We can transport all of them!");
        }else{
            System.out.println("We need more car!");
        }

    }
    public static boolean canTranspose(Integer celebrities, Integer type1, Integer type2){
        int vehicle2 = 0;
        while (celebrities-vehicle2*5>4 && vehicle2<type2){
            vehicle2++;
        }
        return type1 >= celebrities-vehicle2*5;
    }
}
