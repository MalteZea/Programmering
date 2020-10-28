package Kapitel07;

import java.util.Random;

public class ArrayClassColors {
    static final int X = 6;
    static final int Y = 4;
    static final String Z = "Blue";

    public static void main(String[] args) {
        Colors();
    }

    public static void Colors() {
        System.out.println("The selected colors are:");
        String[] selectedColors = new String[X];
        Colors testColor = new Colors();
        for (int i = 0; i < selectedColors.length; i++) {
            selectedColors[i] = testColor.colors[i];
        }


        for (int i = 0; i < X; i++) {
            System.out.println(selectedColors[i]);
        }
        System.out.println("\nThe random colors are:");
        String[] randomColors = new String[Y];
        for (int i = 0; i < Y; i++) {
            Random random = new Random();
            int r = random.nextInt(X);
            randomColors[i] = selectedColors[r];
            System.out.println(randomColors[i]);
        }
        boolean found = false;

        for (int i = 0; i < randomColors.length; i++) {
            if (randomColors[i].equals(Z)) {
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
