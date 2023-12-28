package Task1;

import java.text.NumberFormat;

import static RandomGenerate.RandomGenerate.generateRandomArray;

public class Task1 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + numberFormat.format(sum) + " рублей");
    }
}