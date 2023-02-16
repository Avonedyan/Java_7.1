package ru.netology.Java7.services;

public class AverageSumService {

    public long allSalesAverageSum;
    public int allSalesAverageSum (int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        int averageSum = sum/(sales.length);
        return averageSum;
    }
}
