package prWeek7.ex7;


import java.util.Scanner;

public class Application {
    private static Scanner scanner = new Scanner(System.in);
    private static Transporter transporter = new Transporter();

    public static void main(String[] args) {
        System.out.println("Please enter the number of celebrities : ");
        int celebrities = scanner.nextInt();
        System.out.println("Please enter the number of car type1 : ");
        int type1 = scanner.nextInt();
        System.out.println("Please enter the number of car type2 : ");
        int type2 = scanner.nextInt();
        System.out.println(transporter.canTranspose(celebrities,type1,type2));
    }
}
