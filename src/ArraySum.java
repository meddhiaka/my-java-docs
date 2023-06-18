public class ArraySum {
    public static int sumArray(int[] t) {
        int sum = 0;
        for(int i = 0; i<t.length; i++) {
            sum += t[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int tab[] = {1, 2};
        int res = sumArray(tab);
        System.out.println("the sum of tab equals " + res);
    }
}