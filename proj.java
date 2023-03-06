import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

public class proj {

    public static void main(String[] args) {
        int[] numbers =  new int[] {4,2,1,6,5,8,9,7,3};
        System.out.println(Arrays.toString(numbers));
        int [] arrResult = quickSort(numbers);
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] quickSort(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}