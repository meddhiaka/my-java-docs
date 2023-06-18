public class Fact {
    private static int Factorial(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        else {
            return n * Factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int res = Factorial(n);

        System.out.println("the factorial of " + n + " is : " + res);
    }
}