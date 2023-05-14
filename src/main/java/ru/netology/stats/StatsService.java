package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int sumSales (long[] sales) {

        return (int) Arrays.stream(sales).sum();
    }

    public int averageSales(long[] sales) {
        int sum = sumSales(sales);

        return sum / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthLessAverage(long[] sales) {
        int averageSales = averageSales(sales);
        int monthLess = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                monthLess = monthLess + 1;
            }
        }
        return monthLess;
    }

    public int monthUnderAverage(long[] sales) {
        int averageSales = averageSales(sales);
        int monthUnder = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                monthUnder = monthUnder +1;
            }
        }
        return monthUnder;
    }
}
