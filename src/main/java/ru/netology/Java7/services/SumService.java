package ru.netology.Java7.services;

public class SumService {

    public long allSalesSum;

    public int allSalesSum (int[] sales) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
            }
        return sum;
    }
}


