import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        System.out.println("Please say the word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(formatToBracketsCI(word));

    }
    public static String formatToBracketsCI(String word){
        Integer size = word.length();
        word = word.toUpperCase();
        char f_letter = word.charAt(0);
        char l_letter = word.charAt(size-1);
        String section = word.substring(1, size-1);
        section = section.toLowerCase();
        return f_letter+ section + l_letter;
    }
}
