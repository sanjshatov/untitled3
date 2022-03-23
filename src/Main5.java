public class Main5 {
    public static void main(String[] args) {
        int arr[] = {5, 24, 3, 66, 38, 16, 27};
        for (int a = 1; a < arr.length; a++)
            for (int b = arr.length - 1; b >= a; b--) {
                if (arr[b - 1] > arr[b]) {
                    int tmp = arr[b - 1];
                    arr[b - 1] = arr[b];
                    arr[b] = tmp;
                }
            }
        System.out.println(arr[2]);
    }
}
