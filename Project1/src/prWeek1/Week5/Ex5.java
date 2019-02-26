package Week5;

import static Week4.Ex8.getAWord;
import static Week4.Ex8.removeSpaces;

public class Ex5 {
    public static void main(String[] args) {
        String word1 = getAWord();
        String word2 = getAWord();
        if(contains(word1,word2)){
            System.out.println("yes");
            return;
        }
        System.out.println("no");

    }
    public static boolean contains(String word1, String word2){
        word1 = removeSpaces(word1);
        word2 = removeSpaces(word2);

        int length1 = word1.length();
        int length2 = word2.length();

        int firstPos = 0;

        while(firstPos<=length1-length2){
            int lastPos = firstPos + length2 -1;
            String section = word1.substring(firstPos,lastPos+1);
            if(section.equals(word2)){
                return true;
            }
            firstPos++;
        }
        return false;
    }
}
