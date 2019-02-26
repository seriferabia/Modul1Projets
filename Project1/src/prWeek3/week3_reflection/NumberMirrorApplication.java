package prWeek3.week3_reflection;

import java.util.Scanner;


public class NumberMirrorApplication {
    public static void main(String[] args) {
        NumberMirror numberMirror = new NumberMirror();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number: ");
        Integer number = scanner.nextInt();
        Integer mirrorNumber = numberMirror.mirror(number);
        Integer specialMirror = numberMirror.specialMirror2(number);
        System.out.println("Number is "+number);
        System.out.println("Mirror reflection of your number is "+mirrorNumber);
        System.out.println("Special mirror reflection of your number is "+specialMirror);
        System.out.println();

    }


}

