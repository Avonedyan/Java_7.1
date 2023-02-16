package ru.netology.Java7.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxSalesServiceTest {

    @Test
    public void findMaxSalesMonth (){
        MaxSalesService service = new MaxSalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSalesMonth = 8;
        int actualMaxSalesMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);
    }
}
