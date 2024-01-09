package Task2;

import java.text.NumberFormat;

import static RandomGenerate.RandomGenerate.generateRandomArray;

public class Task2 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        int[] arr = generateRandomArray();
        int minSum = arr[0], maxSum = arr[0];
        for (int j : arr) {
            if (j < minSum) {
                minSum = j;
            }
        }
        for (int j : arr) {
            if (j > maxSum) {
                maxSum = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + numberFormat.format(minSum) + " рублей.\n" +
                "Максимальная сумма трат за день составила " + numberFormat.format(maxSum) + " рублейй");
    }
}