public class PrimeNumber {
    public static boolean isPrime (int n) {
        if(n <= 1) {
            return false;
        }
        else 
        {
            for(int i = 2; i<Math.sqrt(n); i++)
            {
                if(n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n1 = 39;
        int n2 = 5;
        System.out.println("the number " + n1 + " is " + isPrime(n1));
        System.out.println("the number " + n2 + " is " + isPrime(n2));
    }
}