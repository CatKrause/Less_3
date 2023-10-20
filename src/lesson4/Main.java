package lesson4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int mean = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите второе значение: ");
        int mean2 = scanner.nextInt();
        System.out.println("вам доступен выбор следующих операций: ");

        System.out.println("введите 1 для сложения " + "\ud83d\ude0a");

        System.out.println("введите 2 для деления " + "\ud83d\ude09");

        System.out.println("введите 3 для умножения " + "\ud83d\ude33");

        System.out.println("введите 4 для вычитания " + "\ud83d\ude0d");

        System.out.println("для всего остального была мастеркард " + "\ud83d\udcb3");

        System.out.print("Выберете операцию: ");
        int operation = scanner.nextInt();
        scanner.nextLine();

        if (operation == 1) {
            int result = mean + mean2;
            System.out.printf("ваш результат равен: %d \n", result);
        } else if (operation == 2) {
            int result = mean / mean2;
            System.out.printf("ваш результат равен: %d \n", result);
        } else if (operation == 3) {
            int result = mean * mean2;
            System.out.printf("ваш результат равен: %d \n", result);
        } else if (operation == 4) {
            int result = mean - mean2;
            System.out.printf("ваш результат равен: %d \n", result);
        } else {
            System.out.println("Введено некорректное значение" + "\uD83D\uDC7F");
        }
        System.out.print("Для связи с оператором нажмите звездочку" + '\u2b50');
        char star = scanner.next().charAt(0);
        if (star == '*') {
            System.out.println("Оператор еще не умеет отвечать на ваши запросы" + "\uD83D\uDE22");
        } else {
            System.out.println("Введено некорректное значение" + "\uD83D\uDC7F");
        }

        scanner.close();
    }
}


//System.out.printf("Результат сложения: %d, результат вычитания: %d, результат умножения: %d, результат деления: %d", mean + mean2, mean - mean2, mean * mean2, mean / mean2);
//scanner.close();


