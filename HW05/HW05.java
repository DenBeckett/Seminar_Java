package HW05;

public class HW05 {
    public static void main(String[] args) {
        int[] array = new int[]{1, -3, 5, 13, 5, -6, 22, 7};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] <= 99) {
                sum += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = sum;
            }
        }
        for (int i = 0; i < array.length; i++){ 
            System.out.println(array[i]);
        }
    }
}
