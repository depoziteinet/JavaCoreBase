import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0};
        System.out.println(Arrays.toString(array) + " - было");
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0)
                array[i] = 1;
                else array[i] = 0;
        }
        System.out.println(Arrays.toString(array) + " - стало");
    }


}
