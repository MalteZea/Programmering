package Kapitel12.Opgave24;

import java.util.Random;

public class FacultyMembers {
    private String firstName;
    private String lastName;
    private Rank rank;
    private double salary;

    Random random = new Random();

    FacultyMembers() {
        firstName = "FirstName";
        lastName = "LastName";
        rank = randomRank();
        salary = salary();
    }
    FacultyMembers(String firstName, String lastName, Rank rank, double salary){
        setFirstName(firstName);
        setLastName(lastName);
        setRank(rank);
        setSalary(salary);
    }

    private Rank randomRank() {
        Rank[] randomRank = Rank.values();
        int length = randomRank.length;
        int randomIndex = random.nextInt(length);
        return randomRank[randomIndex];
    }

    private double salary() {
        double salary = 0;
        switch (rank) {
            case ASSISTANT:
                salary = ((double) random.nextInt(3000100) / 100) + 50000;
                break;
            case ASSOCIATE:
                salary = ((double) random.nextInt(5000100) / 100) + 60000;
                break;
            case FULL:
                salary = ((double) random.nextInt(5500100) / 100) + 75000;
                break;
        }
        return salary;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
