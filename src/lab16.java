import java.util.Arrays;

interface SortLogic {
    int sortLog(int a, int b);
}

public class lab16 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 8, 5, 10, 12, 4, 3, 0, 10, 7};

        sortArray(array, (a, b) -> a - b);
        System.out.print("по возрастанию: ");
        System.out.println(Arrays.toString(array));

        sortArray(array, (a, b) -> b - a);
        System.out.print("по убыванию: ");
        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(int[] array, SortLogic sortLogic) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (sortLogic.sortLog(array[j], array[j + 1]) > 0) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


}