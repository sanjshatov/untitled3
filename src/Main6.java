import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String pswrd;
        do {
            System.out.println("Введите пароль (8-15 символов): ");
            pswrd = scanner.nextLine();
            if (pswrd.length() < 8) {
                System.out.println("Пароль слишком короткий. Повторите ввод!");
            } else if (pswrd.length() > 15) {
                System.out.println("Пароль слишком длинный. Повторите ввод!");
            }
        }
        while (pswrd.length() < 8 || pswrd.length() > 15);
        System.out.println(name);
        System.out.println(pswrd);
    }
}

