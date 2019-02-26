
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        System.out.println("What is the last episode number you watched?");
        Scanner scanner = new Scanner(System.in);
        Integer episode = scanner.nextInt();

        Ex21 obj = new Ex21();
        Double total =obj.calculateTime(episode);
        Integer time = total.intValue();

        Integer hour = (time/60);
        Integer minute = (time%60);

        System.out.println("You have watched a total of "+hour+ " hours and "+ minute+" minutes ("+time+ " minutes).");

    }
    public Double calculateTime(Integer episode){
        Double coef = Math.floor(episode/13);
        Double total = episode*47- coef*(episode-12)*13;
        return total;
    }
}
