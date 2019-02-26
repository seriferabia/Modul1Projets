import java.util.Scanner;

public class Eva16 {
    public static void main(String[] args) {
        System.out.println("Give me a number: ");
        Scanner scanner = new Scanner(System.in);
        Float number = scanner.nextFloat();
        Integer newNumber = roundToClosest(number);
        System.out.println(newNumber);

    }
    public static Integer roundToClosest(Float number){
        number = Math.nextUp(number);
        return number.intValue();
    }
}
