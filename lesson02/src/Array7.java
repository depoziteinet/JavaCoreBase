import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};  // задан массив длина = 10
        int step1 = 2;                                  // шаг (кол-во позиций)
        int[] array2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};  // задан массив длина = 10
        int step2 = -4;                                  // шаг (кол-во позиций)
        int[] array3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};  // задан массив длина = 10
        int step3 = 12;                                  // шаг (кол-во позиций)

        System.out.println(Arrays.toString(array1) + "   - массив длина = 10");
        System.out.println();

        System.out.println(Arrays.toString(moveElements(array1, step1)) + "   Шаг = " + step1);

        System.out.println(Arrays.toString(moveElements(array2, step2)) + "   Шаг = " + step2);

        System.out.println(Arrays.toString(moveElements(array3, step3)) + "   Шаг = " + step3);

    }

    // метод по смещению элементов
    public static int[] moveElements(int[] array, int steps){
        int[] arrayOut = new int[array.length];
        if(Math.abs(steps) % array.length == 0) return array;
        for (int i = 0; i < Math.abs(steps); i++) {
            if(steps > 0) arrayOut = rotateRight(array);
                else arrayOut = rotateleft(array);
        }
        return arrayOut;
    }

    public static int[] rotateRight(int[] array){
        int valueTemp;
        valueTemp = array[array.length-1];
        for (int i = array.length - 1; i > 0 ; i--)
            array[i] = array[i-1];
        array[0] = valueTemp;
        return array;
    }
    public static int[] rotateleft(int[] array){
        int valueTemp;
        valueTemp = array[0];
        for (int i = 0; i < array.length - 1 ; i++)
            array[i] = array[i+1];
        array[array.length - 1] = valueTemp;
        return array;
    }
}
