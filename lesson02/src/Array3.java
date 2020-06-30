import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(array3)+ " - было");
        for (int i = 0; i < array3.length; i++)
            if(array3[i] < 6) array3[i] = array3[i] * 2;
        System.out.println(Arrays.toString(array3)+ " - стало");
    }
}
