import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static Scanner r = new Scanner(System.in);//обязательно static и System.in

    public static void main(String[] args) {
        System.out.println("Задайте нижний предел загаданного значения: ");
        int min = r.nextInt();
        System.out.println("Задайте верхний предел загаданного значения: ");
        int max = r.nextInt();
        int x = min + (int) (Math.random() * (max - min + 1));
//        getRandomNumber(min, max);
//        int a = getRandomNumber(min, max); //вызываем метод генерации случайных чисел, a - случайное число
        System.out.println("Задайте количество попыток: ");
        int z = r.nextInt();
        System.out.println("Угадайте загаданное мной число: ");
        int y = 1;//объявить переменную нужно до цикла! Иначе не пройдет, в while будет неизвестной
        do {
            y = y + 1; //добавляем счетчик попыток
            int b = r.nextInt();
//            System.out.println(y); вывод счетчика для самопроверки
            if (x == b) {
                System.out.println("Совершенно верно!");
                r.close();
            } else {
                if (x < b) {
                    System.out.println("Загаданное мной число меньше! Попробуй еще раз!");
                } else if (x > b) {
                    System.out.println("Загаданное мной число больше! Попробуй еще раз!");
                }
            }

        } while (y <= z);
        System.out.println("Попытки исчерпаны. Загаданное число: " + x);
    }

//    public static int getRandomNumber(int np, int vp) {
//        int x = np + (int) (Math.random() * (vp - np + 1));//используем метод nextInt(max) для генерации случайного чиса с максимальным значением 100
//        return x;

}




