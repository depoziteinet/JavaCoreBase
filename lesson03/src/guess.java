import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Random;
import java.util.Scanner;

public class guess {

    private static int repeatNum;

    public static void main(String[] args) {
        int guessNum;
        int inputNum;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in).useDelimiter(" *");
        do {
            guessNum = random.nextInt(10);
            System.out.println("Угадайте число от 0 до 9. Вам даётся 3 попытки");
            for (int i = 0; i < 3; i++) {
                System.out.println("Осталось попыток: " + (3 - i));
                    inputNum = inputNum(scanner);
                if(inputNum == guessNum) {
                    System.out.println("Вы угадали.");
                    break;
                } else if(inputNum > guessNum){
                    System.out.println("Загаданное число меньше.");
                } else System.out.println("Загаданное число больше.");
            }
            System.out.println("Загаданное число: " + guessNum);
            do {
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                repeatNum = inputNum(scanner);
                if(repeatNum == 0)
                    System.exit(0);
            }while (repeatNum != 1);
        } while (true);
    }

    private static int inputNum(Scanner scanner){
        while (!scanner.hasNextInt()){
            scanner.next();
        }
        return scanner.nextInt();
    }
}
