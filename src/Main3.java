import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) { //проверяет, чтобы имя состояло из 3 слов
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }

    private static String formatName(String name) { //форматирует строку, чтобы она была написана заглавными буквами
        String[] words = name.trim().split(" ");//как в предыдущем методе: убираем пробелы вначале и в конце, создаем массив
        sortByLength(words);//вызываем метод, сортирующий ФИО по длине слов, передает массив words в метод
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + "";
            } else {
                result += str + "";
            }
        }
        return result;
    }

    private static void sortByLength(String[] words) { //метод сортирует по длине слов
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }
        }

    }
}

