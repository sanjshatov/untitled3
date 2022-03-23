import java.util.Arrays;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        System.out.println("Введите среднюю дневную температуру каждого дня");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] mass = data.trim().split(" ");
        int count = mass.length;
        int[] numArr = new int[mass.length];
        for (int i = 0; i < mass.length; i++) {
            numArr[i] = Integer.parseInt(mass[i]);
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + numArr[i];
        }
        int avrg = sum / count;
        int min = numArr[0];
        for (int i = 0; i < count; i++) {
            if (numArr[i] < min) {
                min = numArr[i];
            }
        }
        int max = numArr[0];
        for (int i = 0; i < count; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
            }
        }
        System.out.printf("Средняя температура за период %d дней составила: %d; ", count, avrg);
        System.out.printf("Минимальная температура за период %d дней составила: %d; ", count, min);
        System.out.printf("Максимальная температура за период %d дней составила: %d. ", count, max);
    }
}








