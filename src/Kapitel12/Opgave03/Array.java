package Kapitel12.Opgave03;

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
