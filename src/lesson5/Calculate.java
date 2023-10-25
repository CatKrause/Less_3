package lesson5;


import java.util.Scanner;

public class Calculate {
    public static int add(int mean, int mean2) {
        return mean + mean2;
    }

    public static int subtract(int mean, int mean2) {
        return mean - mean2;
    }

    public static int div(int mean, int mean2) {
        return mean / mean2;
    }

    public static int mult(int mean, int mean2) {
        return mean * mean2;
    }

    public static void operator(char star) {
        switch (star) {
            case '*':
                System.out.println("Оператор еще не умеет отвечать на ваши запросы" + "\uD83D\uDE22");
                break;
            default:
                System.out.println("Введено некорректное значение" + "\uD83D\uDC7F");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int mean = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите второе значение: ");
        int mean2 = scanner.nextInt();
        System.out.println("вам доступен выбор следующих операций: ");

        System.out.println("для сложения введите: 1");

        System.out.println("для деления введите: 2");

        System.out.println("для умножения введите: 3");

        System.out.println("для вычитания введите: 4");

        System.out.println("для всего остального была мастеркард " + "\ud83d\udcb3");

        System.out.print("Выберете операцию: ");
        int operation = scanner.nextInt();
        scanner.nextLine();

        if (operation == 1) {
            int result = add(mean, mean2);
            System.out.printf("ваш результат равен: %d \n", result);
        } else if (operation == 2) {
            double result = div(mean, mean2);
            System.out.printf("ваш результат равен: %.2f \n", result);
        } else if (operation == 3) {
            int result = mult(mean, mean2);
            System.out.printf("ваш результат равен: %d \n", result);
        } else if (operation == 4) {
            int result = subtract(mean, mean2);
            System.out.printf("ваш результат равен: %d \n", result);
        } else {
            System.out.println("Введено некорректное значение" + "\uD83D\uDC7F");
        }
        System.out.print("Для связи с оператором нажмите звездочку" + '\u2b50');
        char star = scanner.next().charAt(0);
        operator(star);

        scanner.close();
    }
}


//System.out.printf("Результат сложения: %d, результат вычитания: %d, результат умножения: %d, результат деления: %d", mean + mean2, mean - mean2, mean * mean2, mean / mean2);
//scanner.close();


