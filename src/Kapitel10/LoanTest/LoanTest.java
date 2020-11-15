package Kapitel10.LoanTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoanTest {

    @org.junit.jupiter.api.Test
    void getAnnualInterestRate() {
        Loan loan = new Loan();
        assertEquals(2.5,loan.getAnnualInterestRate());
    }

    @org.junit.jupiter.api.Test
    void setAnnualInterestRate() {
        Loan loan = new Loan();
        loan.setAnnualInterestRate(1);
        assertEquals(1, loan.getAnnualInterestRate());
    }

    @org.junit.jupiter.api.Test
    void getNumberOfYears() {
        Loan loan = new Loan();
        assertEquals(1, loan.getNumberOfYears());
    }

    @org.junit.jupiter.api.Test
    void setNumberOfYears() {
        Loan loan = new Loan();
        loan.setNumberOfYears(30);
        assertEquals(30, loan.getNumberOfYears());
    }

    @org.junit.jupiter.api.Test
    void getLoanAmount() {
        Loan loan = new Loan();
        assertEquals(1000, loan.getLoanAmount());
    }

    @org.junit.jupiter.api.Test
    void setLoanAmount() {
        Loan loan = new Loan();
        loan.setLoanAmount(20000);
        assertEquals(20000, loan.getLoanAmount());
    }

    @org.junit.jupiter.api.Test
    void getMonthlyPayment() {
        Loan loan = new Loan();
        assertEquals(1000, loan.getLoanAmount());
    }

    @org.junit.jupiter.api.Test
    void getTotalPayment() {
        Loan loan = new Loan();
    }

    @org.junit.jupiter.api.Test
    void getLoanDate() {
    }
}