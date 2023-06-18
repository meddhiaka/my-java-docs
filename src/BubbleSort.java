import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t.length - i - 1; j++) {
                if (t[j] > t[j + 1]) {
                    int temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] t = { 4, 3, 2, 1, 6 };
        System.out.println("Array t before sorting: " + Arrays.toString(t));
        sort(t);
        System.out.println("Array t after sorting: " + Arrays.toString(t));

    }
}