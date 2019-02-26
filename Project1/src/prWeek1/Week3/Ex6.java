package Week3;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Tell me a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while(number<1 || number>10){
            System.out.println("Tell me a number: ");
            number = scanner.nextInt();
        }

        System.out.println("Alright! Let’s perform a trick with that number.");


    }
}
