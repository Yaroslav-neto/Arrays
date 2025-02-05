package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test //Сумма продаж
    public void amountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 180;
        long actualAmount = service.amountSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);

    }

    @Test //Средняя сумма продаж
    public void averageSalesAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSales = 15;
        long actualAverageSales = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test //Месяц с максимальными продажами
    public void monthMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 6;
        int actualMaxMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test //Месяц с минимальными продажами
    public void monthMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test //Количесто месяцев с продажами ниже среднего
    public void getMonthsBelowAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsBelowAverageSales = 5;
        int actualMonthsBelowAverageSales = service.getMonthsBelowAverageSales(sales);

        Assertions.assertEquals(expectedMonthsBelowAverageSales, actualMonthsBelowAverageSales);
    }

    @Test //Количесто месяцев с продажами выше среднего
    public void monthAboveAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthAboveAverageSales = 5;
        int actualMonthAboveAverageSales = service.getMonthAboveAverageSales(sales);

        Assertions.assertEquals(expectedMonthAboveAverageSales, actualMonthAboveAverageSales);
    }
}


