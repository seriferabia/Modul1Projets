package prWeek7.ex6;


import java.util.Scanner;

public class SecretHandshakesApplication {
    private static HandshakeTranslator translator = new HandshakeTranslator();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Good evening, how much does this item cost?");
        Integer price = scanner.nextInt();
        System.out.println(translator.translateIntoMoves(price));
    }
}
