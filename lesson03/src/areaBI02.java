import java.math.BigInteger;

public class areaBI02 {
        public static void main(String[] args) {
            int n = 10000;                                      // число квадратов
            BigInteger[] fibbonachiNum = new BigInteger[n+2];
            fibbonachiNum[0] = BigInteger.ZERO;
            for (int i = 1; i <= (n+1) ; i++) {
                fibbonachiNum[i] = fibonNum(i, fibbonachiNum);
            }
            System.out.println("Площадь периметров " + (n + 1) + " квадратов = " + areaSquares(n + 1, fibbonachiNum));
        }

        public static BigInteger fibonNum(int n, BigInteger[] array){
            if(n == 1 || n == 2)
                return BigInteger.ONE;
            return array[n - 2].add(array[n - 1]);
        }

        public static BigInteger areaSquares(int n, BigInteger[] array){
            BigInteger s = new BigInteger("0");
            for (int i = 1; i <= n; i++) {
                s = s.add(array[i].multiply(BigInteger.valueOf(4)));
            }
            return s;
        }
}

