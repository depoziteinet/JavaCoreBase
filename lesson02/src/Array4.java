public class Array4 {
    public static void main(String[] args) {
        int SIZE = 6;
        int[][] array4 = new int[SIZE][SIZE];
        fillArray4(array4);                                     // заполняем массив случайными элементами
        printArray(array4, "Создали массив:");

        fillOnes(array4);                                       // заполняем диагонали массива единицами
        printArray(array4, "Массив после заполнения диагоналей единицами:");
    }


    public static int[][] fillArray4(int[][] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                array[i][j] = (int) (Math.random() * 100);
        return array;
    }


    public static int[][] fillOnes(int[][] array){
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][(array.length-1) - i] = 1;
        }
        return array;
    }

    public static void printArray(int[][] array, String text){
        System.out.println(text);
        System.out.println();
        for (int[] ints : array) {
            for (int anInt : ints)
                System.out.printf("%4d", anInt);
            System.out.println();
        }
        System.out.println();
    }

}
