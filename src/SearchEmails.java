import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEmails {
    public static void main(String[] args) {
        String txt = "a_shatov@bk.ru, Иван, Владимир, sanj12@ya.ru, skillfactory";
        Pattern ptr = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = ptr.matcher(txt);
        System.out.println("Найдены следующие адреса: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
