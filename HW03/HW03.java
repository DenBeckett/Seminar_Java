package HW03;

public class HW03 {
    public static void main(String[] args) {
        
        int array[] = new int[] {5, 6, 9, 3, 12, 44, 31};
        System.out.println(sumSimple(array));

    }

    public static int sumSimple(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i]) == true) {
                sum += array[i];}
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        double sqrt = Math.sqrt(n);
        for (int i = 2; i < n; i++) {
            int prime = i;
            if (prime > sqrt) {
                return true;
            }
            if (n % prime == 0) {
                return false;
            }
        }
        return true;
    }
}
