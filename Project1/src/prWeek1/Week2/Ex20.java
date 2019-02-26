import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        System.out.println("Woof food do I get today?");
        Scanner scanner = new Scanner(System.in);
        Integer type = scanner.nextInt();
        System.out.println("Jumps "+(type*6)+" times and barks "+ (type+1)+" times.");
    }
}
