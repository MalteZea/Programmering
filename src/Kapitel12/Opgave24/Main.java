package Kapitel12.Opgave24;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Persistens persistens = new Persistens();
        persistens.save();
    }
}
