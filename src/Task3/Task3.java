package Task3;

import java.text.NumberFormat;

import static RandomGenerate.RandomGenerate.generateRandomArray;

public class Task3 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        int[] arr = generateRandomArray();
        int sum = 0;
        float sumAverageValue, days = 30f;
        for (int j : arr) {
            sum += j;
        }
    sumAverageValue = sum / days;
        System.out.println("Средняя сумма трат за месяц составила " + numberFormat.format(sumAverageValue) +
                " рублей");
    }
}