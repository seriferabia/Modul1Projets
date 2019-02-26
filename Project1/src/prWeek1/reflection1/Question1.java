import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        if(canInviteFriens()){
            System.out.println("Yees! I can invite my friends :) ");
        }
        else{
            System.out.println("I need more many to invite my friends :( ");
        }
    }

    public static Integer getHowMuchMoneyHave(){
        System.out.println("How much money do I have?");
        Scanner scanner = new Scanner(System.in);
        Integer money = scanner.nextInt();

        return money;

    }
    public static Integer getHowManyFriendHave(){
        System.out.println("How many friends will I invite?");
        Scanner scanner = new Scanner(System.in);
        Integer friend = scanner.nextInt();

        return friend;

    }
    public static Integer getPriceFromFriend(){
        System.out.println("Hello my friend! How money do you have to pay for dinner?");
        Scanner scanner = new Scanner(System.in);
        Integer friendsMoney = scanner.nextInt();

        return friendsMoney;
    }
    public static boolean canInviteFriens(){

        int moneyOfDerek = getHowMuchMoneyHave();
        int friendNumber = getHowManyFriendHave();
        int number = 0;
        int totalPrice = 0;

        while (number < friendNumber){
            int friendsMoney = getPriceFromFriend();
            totalPrice =totalPrice+ friendsMoney;
            number++;
        }
        return totalPrice <= moneyOfDerek;
    }

}

