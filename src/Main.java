import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int mean = scanner.nextInt();
        System.out.printf("ваше значение: %d \n", mean);
//        System.out.printf("ваше новое значение: %d \n", ++mean);
//        System.out.printf("ваше новое значение: %d \n", --mean);
//        System.out.printf("ваше новое значение: %d \n", mean * 2);
//        System.out.printf("ваше новое значение: %d \n", mean / 3);
        System.out.printf("Ваше первое значение: %d, второе значение: %d, третье значение: %d, четвертое значение: %d", ++mean, --mean, mean * 2, mean / 3);
       scanner.close();
    }
}