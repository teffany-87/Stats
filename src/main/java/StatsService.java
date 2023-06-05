package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int calculateAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int numberOfMonthMinSales(int[] sales) {
        int count = 0; // переменная для подсчёта количества месяцев с продажами меньше среднемесячных.
        int sumAvg = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < sumAvg) {
                count++;
            }
        }
        return count;
    }


    public int numberOfMonthMaxSales(int[] sales) {
        int count = 0; // переменная для подсчёта количества месяцев с продажами больше среднемесячных.
        int sumAvg = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > sumAvg) {
                count++;
            }
        }
        return count;
    }


}