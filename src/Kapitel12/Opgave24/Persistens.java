package Kapitel12.Opgave24;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Persistens {

    public void save() throws FileNotFoundException {
        java.io.File file = new java.io.File("data/largeDataSet.txt");
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        LargeDataSet largeDataSet = new LargeDataSet();
        largeDataSet.createLargeDataSet();
        for (FacultyMembers facultyMembers : largeDataSet.dataSet)
        output.close();
    }

    public void load() throws FileNotFoundException {
        java.io.File file = new java.io.File("data/largeDataSet.txt");

        Scanner input = new Scanner(file);
        ArrayList dataSet = new ArrayList();
        while (input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
            String readRank = input.next();
            double salary = input.nextDouble();
            Rank rank = Rank.ASSOCIATE;
            if (readRank == "ASSISTANT") rank = Rank.ASSISTANT;
            if (readRank == "ASSOCIATE") rank = Rank.ASSOCIATE;
            if (readRank == "FULL") rank = Rank.FULL;

            dataSet.add(new FacultyMembers(firstName, lastName, rank, salary));
        }
        input.close();
    }
}