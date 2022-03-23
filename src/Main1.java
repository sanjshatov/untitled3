public class Main1 {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String removeWhiteSpaces(String str) {
       String s = str.replaceAll("\\s+","");
        return s;//Написать код здесь
    }
}



