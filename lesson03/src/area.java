import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Площадь периметров " + (n + 1) + " квадратов = " + areaSquares(n+1));
    }

    public static int fibonNum(int n){
        int fibNum = 1;
        if(n == 1 || n == 2)
            return fibNum;
        fibNum = fibonNum(n-2)  + fibonNum(n-1);
        return fibNum;
    }

    public static int areaSquares(int n){
        int s = 0;
        for (int i = 1; i <= n; i++)
            s += fibonNum(i) * 4;

        return s;
    }
}

