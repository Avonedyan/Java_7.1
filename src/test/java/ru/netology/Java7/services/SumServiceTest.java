package ru.netology.Java7.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumServiceTest {

    @Test
    public void findSalesSum() {
        SumService service = new SumService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.allSalesSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }
}
