import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

public class proj {

    public static void main(String[] args) {
        int[] numbers =  new int[] {4,2,3,6,5,8,9,7,1};
        System.out.println(Arrays.toString(numbers));
        int [] arrResult = bubbleSort(numbers);
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] bubbleSort(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    writeToFile(array);
                }
            }
        }
        return array;
    }

    public static void writeToFile(int[] intArray){
        String joinedString = Arrays.toString(intArray);
        String file_name = "1.txt";
        File file = new File(file_name);
        try{
            FileWriter writer = new FileWriter(file,true);
            writer.write(joinedString);
            writer.write("\n");
            writer.close();
            System.out.println("Информация добавлена!");
        }
        catch (Exception e){
            System.out.println("Что то пошло не так");
        }
    }

}







