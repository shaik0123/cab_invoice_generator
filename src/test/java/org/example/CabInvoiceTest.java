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

    @Test
    void given_Multiple_Rides_Should_Calculate_AggregateTotal() {

        Rides[] rides = {new Rides(1.0, 5,PrimiumRides.Normal),
                new Rides(0.2, 2,PrimiumRides.Normal)};

        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double totalFare = cabInvoiceGenerator.calculateFare(rides);
        Assertions.assertEquals(20, totalFare, 0.0);
    }
}
