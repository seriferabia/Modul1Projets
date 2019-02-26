import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        System.out.println("Hello! What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Please tell me your order number.");
        Integer order = scanner.nextInt();

        Integer price = (order%3)*4;

        System.out.println("Here you are "+ name+"!. It's "+ price + " Euro.");

    }
}
