import java.util.Scanner;

public class Calc1 {
    static Scanner scanner = new Scanner(System.in);//добавил ключевое слово static, так как ругается,
    // что переменная scanner не может использоваться в статическом методе

    public static void main(String[] args) {

        int operand1 = getInt();
        char operation = getOperation();
        int operand2 = getInt();
        int result = calculation(operand1, operand2, operation);
        System.out.println("Результат: " + result);

        do {
            operand1 = result;
            System.out.println("Первое число: " + operand1);
            operation = getOperation();
            operand2 = getInt();
            result = calculation(operand1, operand2, operation);
            System.out.println("Результат: " + result);
        } while (true);
    }

    public static int getInt() { /* создаем метод для считывания числа и возвращения */
        System.out.println("Введите число: ");
        int operand;
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
        } else {
            System.out.println("Ошибка! Попробуйте еще раз!");
            scanner.next();//заново принимает число, которое вводим
            operand = getInt(); //и вызывает метод getInt
        }
        return operand;
    }

    public static char getOperation() { //создаем метод считывания действия с числами
        System.out.println("Введите действие (+ - * /)");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);//добавляем метод charAt, считывающий только нулевой симвод
        } else {
            System.out.println("Ошибка! Попробуйте еще раз!");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calculation(int operand1, int operand2, char operation) { //метод вычисления, задаем параметры
        int result;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break; //закрыли программу
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Введено некорректное значение");
                result = calculation(operand1, operand2, getOperation());
        }
        return result;
    }
}