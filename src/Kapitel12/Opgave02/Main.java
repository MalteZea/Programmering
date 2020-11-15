package Kapitel12.Opgave02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number between 1-12: ");
        Array array = new Array();
        int monthInput = input.nextInt() - 1;
        try {
            String month = array.getMonths()[monthInput];
            int monthTotalDays = array.getDom()[monthInput];
            System.out.println(month + " is " + monthTotalDays + " days long.");
        } catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.println("Wrong number");
        }
    }
}
