/**
 * Поиск минимального элемента в массиве.
 */

public class FindMinValue {
    public static void main(String[] args) {
        int[] collection = new int[]{3, 32, 28, 4, 99, 13, -1, 3, 123, 2, 24, 9, 3};
        int minValue = collection[0];
        int minIndex = 0;
        for (int i = 1; i < collection.length; i++) {
            if (collection[i] < minValue) {
                minValue = collection[i];           // записываем новое значение в индекс взависмости на какой итерации мы находимся.
                minIndex = i;                       // Записываем номер ячейки
            }
        }
        System.out.println("min value: " + minValue);
        System.out.println("min index: " + minIndex);
    }
}