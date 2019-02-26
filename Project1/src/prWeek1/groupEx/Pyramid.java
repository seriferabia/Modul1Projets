package groupEx;
import static groupEx.Mario_Ashkan_Hala_Serife.getANumber;

public class Pyramid {
    public static void main(String[] args) {
        int height = getANumber();

        for (int i = 1; i <=height ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.printf("#");
            }
            System.out.printf("\n");
        }

    }
}
