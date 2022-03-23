public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(",zsdfhgsad,fhghsadgfg,");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            sb.reverse();
        }
        System.out.println((System.currentTimeMillis() - startTime));

    }
}
