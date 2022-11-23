/**
 * Сортировка пузырьком
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};

        printArray(array);

        boolean isSorted = false; // поставили флажок, что массив уже отсортирован.
        while (!isSorted) {       // пока массив не отсортирован.
            isSorted = true;      // если массив уже отсортирован.
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) { // [i] = 42 [i-1] = 64. Если правый элемент меньше чем левый.
                    int temp = array[i];       // temp = 42. Cоздали временную переменную и записали туда элемент массива.
                    array[i] = array[i - 1];   // поменяли местами элементы по индексу 42 => 64.
                    array[i - 1] = temp;       // temp = 64. Сохранили значение в временную переменную.
                    isSorted = false;          //если какая-то перестановка происходит сбрасываем обратно false.
                }
            }
            printArray(array);
        }
    }


    private static void printArray(int[] arr) {
        System.out.print(" [");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println(" ]");
    }
}