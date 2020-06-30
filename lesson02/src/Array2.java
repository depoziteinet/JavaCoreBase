import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int ARRAY_LENGTH = 8;
        int STEP = 3;
        int[] array2 = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++)
            array2[i] = i * STEP;
        System.out.println(Arrays.toString(array2));
    }
};