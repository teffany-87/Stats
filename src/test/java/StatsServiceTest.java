package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvg() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateSum(sales) / sales.length;

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfMonthMinSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numberOfMonthMinSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfMonthMaxSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numberOfMonthMaxSales(sales);

        assertEquals(expected, actual);
    }

}
