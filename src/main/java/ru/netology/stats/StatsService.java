package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverageAmount(long[] sales) {

        long calculateAverageAmount = calculateSum(sales) / sales.length;
        return calculateAverageAmount;

    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long numberOfMonthsBelowAverage(long[] sales) {
        long averageAmount = calculateAverageAmount(sales);
        int monthsBelowMidSum = 0;
        for (long sale : sales) {
            if (sale < averageAmount)
                monthsBelowMidSum++;
        }
        return monthsBelowMidSum;

    }

    public long numberOfMonthsAboveAverage(long[] sales) {
        long averageAmount = calculateAverageAmount(sales);
        int monthsAboveAverage = 0;
        for (long sale : sales) {
            if (sale > averageAmount) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }
}
