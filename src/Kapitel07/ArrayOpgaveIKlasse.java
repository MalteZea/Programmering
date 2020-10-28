package Kapitel07;

import java.util.ArrayList;
import java.util.Random;

public class ArrayOpgaveIKlasse {
    static final int X = 6;
    static final int Y = 4;
    static final String Z = "Blue";

    public static void main(String[] args) {
        Colors();
    }

    public static void Colors() {
        System.out.println("The selected colors are:");

        String[] selectedColors = new String[X];
        selectedColors[0] = "Red";
        selectedColors[1] = "Green";
        selectedColors[2] = "Yellow";
        selectedColors[3] = "Black";
        selectedColors[4] = "Purple";
        selectedColors[5] = "Blue";

        for (int i = 0; i < X; i++) {
            System.out.println(selectedColors[i]);
        }
        System.out.println("\nThe random colors are:");
        ArrayList<String> randomColors = new ArrayList<>();
        for (int i = 0; i < Y; i++) {
            Random random = new Random();
            int r = random.nextInt(X);
            randomColors.add(selectedColors[r]);
            System.out.println(randomColors.get(i));
        }
        boolean found = false;

        for (int i = 0; i < randomColors.size(); i++) {
            if (randomColors.get(i).equals(Z)) {
                System.out.println("\nHurray! The color " + Z + " was found in the array randomColors!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nThe color " + Z + " was NOT found in the array randomColors.");
        }

    }
}
