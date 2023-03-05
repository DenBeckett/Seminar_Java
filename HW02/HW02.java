// Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
// Пример ввода:
// 1 2 1 2 -1 1 3 1 3 -1 0
// Логика расчета:
// 2 -1 переход -> 2 в сумму
// 3 -1 переход -> 3 в сумму
// Пример вывода: 5


package HW02;
import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = 0;
        int a = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int b = sc.nextInt();
            if (a>0 && b<0) {
                S += a;
            }
            a=b;
        }
        System.out.println("S = "+S);
        sc.close();
    }
}
