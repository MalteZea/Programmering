package Kapitel12.Opgave03;

/** 12.3(InputMismatchException) The previous program works well as long
 as the user enters an integer. Otherwise, you may get another kind of
 exception. For instance, if you use nextInt() of Scanner, you could have an
 InputMismatchException. Modify it to prevent users entering anything
 other than an integer.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number between 1-12: ");
        Array array = new Array();
        try {
            int monthInput = input.nextInt() - 1;
            String month = array.getMonths()[monthInput];
            int monthTotalDays = array.getDom()[monthInput];
            System.out.println(month + " is " + monthTotalDays + " days long.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong number");
        } catch (InputMismatchException e){
            System.out.println("Wrong input");
        }
    }
}
