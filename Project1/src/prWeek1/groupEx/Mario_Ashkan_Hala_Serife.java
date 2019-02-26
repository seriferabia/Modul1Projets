package groupEx;
import java.util.Scanner;

public class Mario_Ashkan_Hala_Serife {
    public static void main(String[] args) {

        int number = getANumber();
        while(!isValid(number)){
            number = getANumber();
        }

        for(int i=number; i>0; i--){
            for(int position=0; position<i-1; position++){
                System.out.printf(" ");
            }
            for(int position=i-1; position <number+1; position++){
                System.out.printf("#");
            }
            System.out.printf("\n");
        }

    }

    public static Integer getANumber(){
        System.out.println("Tell me a number: ");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        return  number;
    }

    public static boolean isValid(Integer number){
        return number>-1 && number<24;
    }

}
