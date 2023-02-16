package ru.netology.Java7.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageSumServiceTest {

    @Test
    public void findAverageSalesSum(){
        AverageSumService service = new AverageSumService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSum = 15;
        int actualAverageSum = service.allSalesAverageSum(sales);
        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }
}
