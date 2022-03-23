import java.util.Scanner;

public class Bell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько раз позвонить?");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            String txt = sound(i);
            System.out.println(txt);
        }
    }

    static String sound(int i) {
        int check = i % 2;
        if (check == 0) return "dong";
        else return "ding";
    }
}
