package Kapitel12.Opgave24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacultyMembersTest {

    @Test
    void getFirstName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void getRank() {
    }

    @Test
    void getSalary() {
        FacultyMembers facultyMembers = new FacultyMembers();
        System.out.println(facultyMembers.getRank());
        System.out.println(facultyMembers.getSalary());
    }
}