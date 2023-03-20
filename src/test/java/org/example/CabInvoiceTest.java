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
    public void given_MultipleRide_Should_Return_Invoice_Summary(){

        Ride[] rides = { new Ride(2.0, 5),
                new Ride(0.1, 1)};
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double fare = cabInvoiceGenerator.calculateFare(rides);
        Assertions.assertEquals(30,fare,0.0);

    }
}
