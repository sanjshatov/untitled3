
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите ФИО:");
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
    }

    private static boolean checkName(String name) {
        name.trim();//убирает лишние пробелы в начале и конце строки, чтобы они не считались
        int count = 0;//начальное кол-во слов равно 0
        if (name.length() != 0) {//если ввели хотя бы одно слово, тогда программа работает, иначе конец программы.
            count++;
            for (int i = 0; i < name.length(); i++) {//проверяем каждый символ, не пробел ли это
                if (name.charAt(i) == ' ') {//если пробел, увеличиваем количество слов на 1
                    count++;
                }
            }
        }
        if (count == 3)
            return true;

        else return false;
    }
}