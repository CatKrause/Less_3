import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int mean = scanner.nextInt();
        System.out.printf("ваше первое значение: %d \n", mean);
        scanner.nextLine();
        System.out.print("Введите второе значение: ");
        int mean2 = scanner.nextInt();
        System.out.printf("ваше второе значение: %d \n", mean2);

        System.out.printf("Результат сложения: %d, результат вычитания: %d, результат умножения: %d, результат деления: %d", mean + mean2, mean - mean2, mean * mean2, mean / mean2);
        scanner.close();
    }
}