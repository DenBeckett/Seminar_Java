package Ex4;

public class Ex4 {
    System.out.println(isArraySymmetrical(new int[] {3,4,5,6,7,8,3}));

    public static boolean isArraySymmetrical(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
