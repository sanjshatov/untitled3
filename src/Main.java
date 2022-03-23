public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int x = getDiceNumber();
            System.out.println(x);
        }
    }

    public static int getDiceNumber() {
        return (int) (Math.random() * 6);
    }
}


