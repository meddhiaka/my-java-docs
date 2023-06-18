public class BinarySearch {
    public static int binarySearch(int[] t, int target) {
        int low = 1;
        int high = t.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (t[mid] == target) {
                return mid;
            } else if (t[mid] < target) {
                low = mid + 1;
            } else if (t[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 4, 5 };
        int x = 5;
        int res = binarySearch(t, x);
        System.out.println("the index of " + x + " is " + (res + 1));
    }
}