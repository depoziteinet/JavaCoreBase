
import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int[] array1 = {3, 2, 1, 1, 2, 3}; // true {3, 2, 1, || 1, 2, 3}
        int[] array2 = {1, 2, 3, 1, 1, 1}; // false
        int[] array3 = {1, 2, 30, 1, 2, 2, 1, 3, 1, 2, 21}; // true {1, 2, 30, || 1, 2, 2, 1, 3, 1, 2, 21}
        int[] array4 = {1, 2, 3, 0}; // true {1, 2, || 3, 0}

        printYesNoEqually(array1);
        printYesNoEqually(array2);
        printYesNoEqually(array3);
        printYesNoEqually(array4);

    }

    public static boolean leftEquallyRight(int[] array){
        boolean equally = false;
        for (int i = 0; i < (array.length-1); i++) {
            if(sum(array,0 , i) == sum(array, i+1, array.length-1)) {
                equally = true;
                break;
            }
        }
        return equally;
    }

    public static int sum(int[] array, int minElement, int maxElement){
        int summa = 0;
        for (int i = minElement; i <= maxElement; i++)
            summa += array[i];
        return summa;
    }

    public static void printYesNoEqually(int[] array){
        System.out.println(Arrays.toString(array));
        if (leftEquallyRight(array))
            System.out.println("В массиве есть место, в котором сумма левой и правой части массива равны");
        else  System.out.println("В массиве нет места, в котором сумма левой и правой части массива равны");
    }
}
