
public class Main {
    public static void main(String[] args) {
        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte by = 0;
        short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0f;
        double dob = 0;
        char ch = '0';
        boolean yes = true;

        // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий
        // результат,где a, b, c, d – входные параметры этого метода;
        double a = 10;
        double b = 10;
        double c = 10;
        double d = 10;
        System.out.println(calculation(a, b, c, d));

        //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма
        // лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        double num1 = 100.05;
        double num2 = -80.25;
        System.out.println("Сумма чисел: " + num1 + " и " + num2 + " лежит в диапазоне от 10 до 20 включительно? " + trueBetween(num1, num2));

        //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
        // положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        int num = -40;
        posOrNeg(num);

        //6. Написать метод, которому в качестве параметра передается целое число,
        // метод должен вернуть true, если число отрицательное;
        System.out.println("Число " + num + " отрицательное? " + ifNeg(num));

        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен
        // вывести в консоль сообщение «Привет, указанное_имя!»;
        String name = "Тимофей";
        hellow(name);

        //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        int year = 2020;
        leapYear(year);
    }

    public static double calculation(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public static boolean trueBetween(double num1, double num2) {
        double summa = num1 + num2;
        return (summa >= 10 && summa <= 20);
    }

    public static void posOrNeg(int num){
        String text = "положительное.";
        if (num < 0)
            text = "отрицательное.";
        System.out.println("Число " + num + " - " + text);
    }

    public static boolean ifNeg(int num){
        return (num < 0);
    }

    public static void hellow(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYear(int year){
        String text = "не високосный.";
        if((year % 400 == 0) || (year % 4 == 0 && !(year % 100 == 0)))
            text = "високосный.";
        System.out.println("Год " + year + " - " + text);
    }
}
