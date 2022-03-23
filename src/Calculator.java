import java.util.Scanner;//https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
public class Calculator {
    public static void main(String[] args) {
        int operand1;//сначала описываем переменные (число1, число2, результат, символ действия (+ - * /)
        int operand2;
        int result;
        char act;

        Scanner scanner = new Scanner(System.in);//Для считывания ввода нужно использовать класс Scanner. Сохдаем объект scanner класса Scanner
        System.out.println("Ведите 2 числа через пробел:");
        operand1 = scanner.nextInt();//Метод next() класса Scanner считывает строку
        operand2 = scanner.nextInt();
        System.out.println("Введите действие: + - * /");
        act = scanner.next().charAt(0);//Метод next() класса Scanner считывает строку,
//        а метод charAt(0) позволяет взять первый символ в этой строке.так мы получаем операцию,
//        которую нужно выполнить
        switch (act) {
            case '+': result = operand1 + operand2;
            break;
            case '-': result = operand1 - operand2;
            break;
            case '*': result = operand1 * operand2;
            break;
            case '/': result = operand1 / operand2;
            default:
                System.out.println("Ты че-то не то вводишь!");
                return;
        }
        System.out.println("Результат: ");
        System.out.printf(operand1+" "+act+" "+operand2+" = "+result);
    }
}
