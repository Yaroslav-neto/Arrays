package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int amountSales(int[] sales) {//Сумма продаж

        return Arrays.stream(sales).sum();
    }

    public int averageSalesAmount(int[] sales) {//Средняя сумма продаж
        int month = sales.length;
        int averageSales = amountSales(sales) / month;

        return averageSales;
    }

    public int getMaxMonth(int[] sales) {//Месяц с максимальными продажами
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }


        findMaxIndices(sales);
        return maxMonth + 1;
    }


    public static void findMaxIndices(int[] array) {
        if (array.length == 0) {
            System.out.println("Массив пуст.");
            return;
        }

        int max = Integer.MIN_VALUE;

        // Находим максимальное значение в массиве
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }

        System.out.print("Месяцы с максимальными продажами (" + max + "): ");

        // Ищем индексы ячеек с максимальным значением
        boolean found = false; // Флаг, чтобы проверить, были ли найдены индексы
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.print(i + 1 + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Нет индексов с максимальным значением.");
        }
    }

    public int getMinMonth(int[] sales) {//Месяц с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        findMinIndices(sales);
        return minMonth + 1;
    }

    public void findMinIndices(int[] array) {
        if (array.length == 0) {
            System.out.println("Массив пуст.");
            return;
        }

        int min = Integer.MAX_VALUE;

        // Находим минимальное значение в массиве
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }

        System.out.print("Месяцы минимальными продажами (" + min + "): ");

        // Ищем индексы ячеек с минимальным значением
        boolean found = false; // Флаг, чтобы проверить, были ли найдены индексы
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                System.out.print(i + 1 + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Нет индексов с минимальным значением.");
        }
    }

    public int getMonthsBelowAverageSales(int[] sales) { //количество месяцев, в которых продажи были ниже среднего
        int belowAverageSales = 0;
        int averageSalesAmount = averageSalesAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSalesAmount) {
                belowAverageSales = belowAverageSales + 1;

            }
        }
        return belowAverageSales;
    }

    public int getMonthAboveAverageSales(int[] sales) {//количество месяцев, в которых продажи были выше среднего

        int aboveAverageSales = 0;
        int averageSalesAmount = averageSalesAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSalesAmount) {
                aboveAverageSales = aboveAverageSales + 1;

            }
        }
        return aboveAverageSales;
    }

}