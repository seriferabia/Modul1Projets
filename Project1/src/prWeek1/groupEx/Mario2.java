package groupEx;

import static groupEx.Mario_Ashkan_Hala_Serife.getANumber;
import static groupEx.Mario_Ashkan_Hala_Serife.isValid;

public class Mario2 {
    public static void main(String[] args) {

        int height = getANumber();
        while (!isValid(height)) {
            height = getANumber();
        }
        for (int currentLineNumber = 1; currentLineNumber <= height; currentLineNumber++) {

            for (int numberOfSpaces = 0; numberOfSpaces < height - currentLineNumber; numberOfSpaces++) {
                System.out.printf(" ");
            }

            for (int numberOfHashes = height - currentLineNumber; numberOfHashes < height + 1; numberOfHashes++) {
                System.out.printf("#");
            }
            System.out.printf("\n");
        }

    }
}

