import java.util.Scanner;

public class Imt {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите массу вашего тела в кг: ");
        int m = read.nextInt();
        System.out.println("Введите ваш рост в см: ");
        int h = read.nextInt();
        double imt = (m * 10000) / (h*h);
        if (imt >= 18.5 && imt <= 24.9) {
            System.out.println("У вас нормальный вес!");
        } else if (imt >= 25.0 && imt <= 29.9) {
            System.out.println("У вас избыточный вес");
        } else if (imt >= 30.0 && imt <= 34.9) {
            System.out.println("У вас ожирение 1 степени");
        } else if (imt >= 35.0 && imt <= 39.9) {
            System.out.println("У вас ожирение 2 степени");
        } else if (imt > 40) {
            System.out.println("У вас ожирение 3 степени");
        } else {
            System.out.println("У вас недостаток веса");
        }
    }
}
