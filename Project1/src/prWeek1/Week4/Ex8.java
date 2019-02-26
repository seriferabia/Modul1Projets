package Week4;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        String word = getAWord();
        System.out.println(isAPalindrome(removeSpaces(word)));
    }

    public static boolean isAPalindrome(String word) {
        word = removeSpaces(word);
        int firstPosition = 0;
        int lastPosition = word.length()-1;
        while(lastPosition>firstPosition){
            if(word.charAt(firstPosition)!=(word.charAt(lastPosition))){
                return false;
            }
            firstPosition++;
            lastPosition--;
        }
        return true;
    }

    public static String removeSpaces(String word) {
        String newWord = "";
        int position = 0;

        while(position<word.length()){
            char letter = word.charAt(position);
            if(letter!=32){
                newWord = newWord + letter;
            }
            position++;
        }
        return newWord;
    }

    public static String getAWord() {
        System.out.println("Tell me a word: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
