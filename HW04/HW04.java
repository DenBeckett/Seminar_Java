package HW04;

public class HW04 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        boolean sequence = true;
        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i] < array[i - 1]) {
            sequence = false;
            break;
            }
        }

        String result;
        if (sequence == true) {
            result = "Да";
        } else {
            result = "Нет";
        }
        System.out.println("Является ли массив возрастающей последовательностью? " + result);
    }
}
