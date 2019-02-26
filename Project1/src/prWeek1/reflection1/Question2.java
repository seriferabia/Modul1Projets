//package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        int moneyOfDerek = getHowMuchMoneyHave();
        int total = getTotalPrice();

        if(!canInviteFriens(total, moneyOfDerek)){
            System.out.println("I need more money to invite!");
            return;
        }
        System.out.println("Yes I can invite my friends :) ");
        int price = getYourPrice();
        total = total+price;
        if(!canInviteFriens(total, moneyOfDerek)){
            System.out.println("I need to cancel dinner!");
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
    public static Integer getTotalPrice(){

        int friendNumber = getHowManyFriendHave();
        int number = 0;
        int totalPrice = 0;

        while (number < friendNumber){
            int friendsMoney = getPriceFromFriend();
            totalPrice =totalPrice+ friendsMoney;
            number++;
        }
        return totalPrice;
    }
    public static boolean canInviteFriens(int totalPrice, int moneyOfDerek){
        return totalPrice<= moneyOfDerek;
    }
    public  static int getYourPrice(){
        System.out.println("How much do I have to pay?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

}



