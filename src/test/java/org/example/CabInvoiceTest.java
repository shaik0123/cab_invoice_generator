package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceTest {
    @Test
    void given_Distance_And_Time_Should_Return_TotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double TotalFare = cabInvoiceGenerator.CalculateFare(5.0, 4);
        Assertions.assertEquals(54, TotalFare);
    }

    @Test
    void given_Distance_And_Time_Should_Return_MinFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double TotalFare = cabInvoiceGenerator.CalculateFare(0.1, 2);
        Assertions.assertEquals(5, TotalFare);
    }
}
