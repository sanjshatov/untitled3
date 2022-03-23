public class Arr1 {
    public static void main(String[] args) {

        String x = CheckUserName();
        System.out.println(x);


    }
    public static String CheckUserName() {
        String s = "Иван Иванов";
        String s1 = "иван иванов";
        if (s.equalsIgnoreCase(s1)) {
            s = "Имя занято!";
                return s;
            } else {
                s = "Имя не занято!";
                return s;
            }
        }
    }



