package ru.netology.stats;

import java.util.Arrays;

public class StatsService {


    public long amountSales(long[] sales) {//Сумма продаж
        return Arrays.stream(sales).sum();
    }


    public long averageSalesAmount(long[] sales) {//Средняя сумма продаж
        int month = sales.length;
        return amountSales(sales) / month;
    }


    public int getMaxMonth(long[] sales) {//Месяц с максимальными продажами
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int getMinMonth(long[] sales) {//Месяц с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int getMonthsBelowAverageSales(long[] sales) { //количество месяцев, в которых продажи были ниже среднего

        int belowAverageSales = 0;
        long averageSalesAmount = averageSalesAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSalesAmount) {
                belowAverageSales = belowAverageSales + 1;
            }
        }
        return belowAverageSales;
    }


    public int getMonthAboveAverageSales(long[] sales) {//количество месяцев, в которых продажи были выше среднего

        int aboveAverageSales = 0;
        long averageSalesAmount = averageSalesAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSalesAmount) {
                aboveAverageSales = aboveAverageSales + 1;
            }
        }
        return aboveAverageSales;
    }

}