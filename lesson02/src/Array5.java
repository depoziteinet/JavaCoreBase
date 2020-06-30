import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        int SIZE = 10;
        int[] array5 = new int [SIZE];
        fillArray(array5);                                  // заполняем массив случайными элементами
        System.out.println(Arrays.toString(array5));
        System.out.println("минимальный элемент: " + min(array5));
        System.out.println("максимальный элемент: " + max(array5));

    }

    public static int[] fillArray(int[] array){
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 100);
        return array;
    }

    public static int min(int[] array){
        int minNum = array[0];
        for (int i : array) {
            if (i < minNum)  minNum = i;
        }
        return minNum;
    }

    public static int max(int[] array){
        int maxNum = array[0];
        for (int i : array) {
            if (i > maxNum)  maxNum = i;
        }
        return maxNum;
    }

}
