package lesson4;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 101) - 50);
            System.out.println(array[i]);
        }
        int negativeCount = 0;
        int positiveCount = 0;
        int countNull = 0;
        int endZeroCount = 0;
        int positiveSum = 0;
        int negativeSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeCount++;
            } else if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] == 0) {
                countNull += 1;
            }
            if (array[i] % 10 == 0 && array[i] != 0) {
                endZeroCount++;
            }
            if (array[i] > 0) {
                positiveSum += array[i];
            }
            if (array[i] < 0) {
                negativeSum += array[i];
            }
        }
        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        int average = sum / array.length;

        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
        System.out.println("Количество нулей: " + countNull);
        System.out.println("Количество чисел, оканчивающихся на 0: " + endZeroCount);
        System.out.println("Сумма всех положительных чисел: " + positiveSum);
        System.out.println("Сумма всех отрицательных чисел: " + negativeSum);
        System.out.println("Сумма всех чисел: " + sum);
        System.out.println("Среднее число по массиву: " + average);
    }
}




