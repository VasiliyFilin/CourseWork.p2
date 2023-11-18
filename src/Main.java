import java.util.Arrays;

public class Main {
    public static void reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arr));
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}