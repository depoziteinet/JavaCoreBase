import java.util.Random;
import java.util.Scanner;

public class TICTACtoe99 {

    public static final int SIZE = 5;
    public static final int DOT_TO_WIN = 3;
    public static final int TEN = 9;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_HUMAN = 'X';
    public static final char DOT_COMPUTER = 'O';
    public static final String EMPTY1 = " ";
    public static final String EMPTY2 = "  ";
    public static final String  FIRST_EMPTYCHAR = "   ";


    public static char[][] map = new char[SIZE][SIZE];
    public static Scanner in = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void main(String[] args) {
        playGame();

    }

    private static void playGame() {
        initMap();

        printMap();

        playing();
    }


    private static void initMap() {
        //задаём матрицу
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                aiStepComputer(i, j, DOT_EMPTY);

            }

        }
    }

    private static void printMap() {
        System.out.print(FIRST_EMPTYCHAR);
        for (int i = 0; i < SIZE; i++) {
            if(i < TEN)
            System.out.print(EMPTY2 + (i+1));
            else System.out.print(EMPTY1 + (i+1));
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            if(i < TEN)
            System.out.print(EMPTY2 + (i + 1));
                else System.out.print(EMPTY1 + (i + 1));
            for (int j = 0; j < SIZE; j++) {
                System.out.print(EMPTY2 + map[i][j]);
            }
            System.out.println();
        } System.out.println();
    }

    private static void playing() {
        while (true){
            stepHuman();
            printMap();

            if(stepPreWinIsWin(DOT_HUMAN, true)){
                System.out.println("Вы Выйграли");
                System.exit(0);
            }

//            if(isWin(DOT_HUMAN)){
//                System.out.println("Вы Выйграли");
//                System.exit(0);
//            }

            stepComputer();
            printMap();

            if(stepPreWinIsWin (DOT_COMPUTER, true)){
                System.out.println("Вы проиграли");
                System.exit(0);
            }

        }
    }

    private static void stepHuman() {
        int inputNumX;
        int inputNumY;
         do {
            System.out.println("Введите номер строки:");
            inputNumX = inputInt();
            System.out.println("Введите номер столбца:");
            inputNumY = inputInt();

        }while (map[inputNumX - 1][inputNumY - 1] != DOT_EMPTY);

        aiStepComputer(inputNumX - 1, inputNumY - 1, DOT_HUMAN);

    }
    public static int inputInt(){
        int num;
        do {
            System.out.println("Введите цифру от 1 до " + SIZE);
            while (!in.hasNextInt()){
                in.next();
                System.out.println("Введите цифру!");
            }
            num = in.nextInt();
        }while (num <= 0 || num  > SIZE);
        return num;

    }

    private static void stepComputer() {
        boolean preWinLoss;

        preWinLoss = stepPreWinIsWin (DOT_COMPUTER, false);
        if(!preWinLoss) {
            preWinLoss = stepPreWinIsWin (DOT_HUMAN, false);
        }
        if(!preWinLoss) {
            stepRandom();
        }
    }

    private static boolean stepPreWinIsWin(char symbol, boolean checkWin) {
        int coordinateX = 0;
        int coordinateY = 0;
        boolean stepTrue = false;
        int quantSymbolEmpty;
        int quantSymbol;

        for (int i = 0; i < SIZE; i++) {
            if(stepTrue)
                break;
            for (int j = 0; j < (SIZE + 1 - DOT_TO_WIN); j++) {
                quantSymbol = 0;
                quantSymbolEmpty = 0;
                if(stepTrue)
                    break;
                for (int l = 0; l < DOT_TO_WIN; l++) {
                    if (map[i][j + l] == symbol) {
                        quantSymbol += 1;
                    } else if (map[i][j + l] == DOT_EMPTY) {
                        quantSymbolEmpty += 1;
                        coordinateX = i;
                        coordinateY = j + l;
                    }
                }
                if(checkWin && (quantSymbol == DOT_TO_WIN)) {
                    stepTrue = true;
                    break;
                }
                else  if (!checkWin && (quantSymbolEmpty == 1) && (quantSymbol == DOT_TO_WIN - 1)){
                    stepTrue = true;
                    break;
                }
            }
        }
        if(!stepTrue) {
            for (int i = 0; i < SIZE; i++) {
                if (stepTrue)
                    break;
                for (int j = 0; j < (SIZE + 1 - DOT_TO_WIN); j++) {
                    quantSymbol = 0;
                    quantSymbolEmpty = 0;
                    if (stepTrue)
                        break;
                    for (int l = 0; l < DOT_TO_WIN; l++) {
                        if (map[j + l][i] == symbol) {
                            quantSymbol += 1;
                        } else if (map[j + l][i] == DOT_EMPTY) {
                            quantSymbolEmpty += 1;
                            coordinateX = j + l;
                            coordinateY = i;
                        }
                    }
                    if(checkWin && (quantSymbol == DOT_TO_WIN)) {
                        stepTrue = true;
                        break;
                    }
                    else  if (!checkWin && (quantSymbolEmpty == 1) && (quantSymbol == DOT_TO_WIN - 1)){
                        stepTrue = true;
                        break;
                    }
                }
            }
        }

        if(!stepTrue) {
            for (int i = 0; i < SIZE + 1 - DOT_TO_WIN; i++) {
                if (stepTrue)
                    break;
                for (int j = 0; j < (SIZE + 1 - DOT_TO_WIN ); j++) {
                    quantSymbol = 0;
                    quantSymbolEmpty = 0;
                    if (stepTrue)
                        break;
                    for (int l = 0; l < DOT_TO_WIN; l++) {
                        if (map[i + l][j + l] == symbol) {
                            quantSymbol += 1;
                        } else if (map[i + l][j + l] == DOT_EMPTY) {
                            quantSymbolEmpty += 1;
                            coordinateX = i + l;
                            coordinateY = j + l;
                        }
                    }
                    if(checkWin && (quantSymbol == DOT_TO_WIN)) {
                        stepTrue = true;
                        break;
                    }
                    else  if (!checkWin && (quantSymbolEmpty == 1) && (quantSymbol == DOT_TO_WIN - 1)){
                        stepTrue = true;
                        break;
                    }
                }
            }
        }


        if(!stepTrue) {
            for (int i = SIZE; i >= DOT_TO_WIN; i--) {
                if (stepTrue)
                    break;
                for (int j = 0; j < (SIZE + 1 - DOT_TO_WIN); j++) {
                    quantSymbol = 0;
                    quantSymbolEmpty = 0;
                    if (stepTrue)
                        break;
                    for (int l = 0; l < DOT_TO_WIN; l++) {
                        if (map[(i - 1) - l][j + l] == symbol) {
                            quantSymbol += 1;
                        } else if (map[(i - 1) - l][j + l] == DOT_EMPTY) {
                            quantSymbolEmpty += 1;
                            coordinateX = (i - 1) - l;
                            coordinateY = j + l;
                        }
                    }
                    if(checkWin && (quantSymbol == DOT_TO_WIN)) {
                        stepTrue = true;
                        break;
                    }
                    else  if (!checkWin && (quantSymbolEmpty == 1) && (quantSymbol == DOT_TO_WIN - 1)){
                        stepTrue = true;
                        break;
                    }
                }
            }
        }

        if(!checkWin && stepTrue)
            aiStepComputer(coordinateX, coordinateY, DOT_COMPUTER);
        return stepTrue;
    }

    private static void stepRandom() {
        int inputCompX;
        int inputCompY;
        do {
            inputCompX = rnd.nextInt(SIZE) + 1;
            inputCompY = rnd.nextInt(SIZE) + 1;

        } while (map[inputCompX - 1][inputCompY - 1] != DOT_EMPTY);
        aiStepComputer(inputCompX - 1, inputCompY - 1, DOT_COMPUTER);
    }

     private static void aiStepComputer(int coordinateX, int coordinateY, char symbol) {
        map[coordinateX][coordinateY] = symbol;
    }
}
