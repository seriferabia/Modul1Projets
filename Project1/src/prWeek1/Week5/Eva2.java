package Week5;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Eva2 {
    public static void main(String[] args) {
        int guest = getGuestNumber();
        int pack = calculatePacksAndUnused(guest).get(0);
        int unused = calculatePacksAndUnused(guest).get(1);

        System.out.println("You need to buy "+ pack + " and " + unused + " plates will remain unused.");



    }
    public  static Integer getGuestNumber(){
        System.out.println("How many guest do you have?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static List<Integer> calculatePacksAndUnused(Integer guest){
        int plate = guest-3;
        Double packs = Math.ceil( (plate/5.0));
        int pack = packs.intValue();
        int remain = pack*5+3-guest;
        List<Integer> plates = Arrays.asList(pack,remain);
        return plates;
    }
}
