package Kapitel12.Opgave02;

/**12.2 (ArrayIndexOutOfBoundsException) Using the two arrays shown below,
        write a program that prompts the user to enter an integer between 1 and 12 and
        then displays the months and its number of days corresponding to the integer
        entered. Your program should display “wrong number” if the user enters a
        wrong number by catching ArrayIndexOutOfBoundsException.*/

public class Array {
    Array(){}

    public String[] getMonths() throws ArrayIndexOutOfBoundsException {
        return months;
    }

    public int[] getDom() throws ArrayIndexOutOfBoundsException {
        return dom;
    }

    private String[] months = {"January", "February", "March", "April", "May", "June","July", "August",
            "September", "October", "November", "December"};
    private int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
}
