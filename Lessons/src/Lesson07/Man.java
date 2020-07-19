package Lesson07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Man{

     public static void main(String[] args) {
         final int NUM_EAT = 3;                     // кол-во кормёшек
         List<Cat> list = new ArrayList<>();
         Cat cat1 = new Cat("Мартин", 7);
         Cat cat2 = new Cat("Вася", 9);
         Cat cat3 = new Cat("Шарик", 25);
         Plate plate = new Plate(0);
         list.add(cat1);
         list.add(cat2);
         list.add(cat3);

         for (int i = 0; i < NUM_EAT; i++) {

             // задаём параметр котам: голоден/неголоден
            for (Cat cat : list) {
                cat.setSatiety(new Random().nextBoolean());
            }

            System.out.println("Время поесть !!!\n");
            plate.info();

            for (Cat cat : list) {
                if(cat.isSatiety())
                    catsEat(cat, plate);
                else System.out.println(cat.name + " не голоден");
             }

            System.out.println("\nПоели !!!" + "\n---------------------------\n");
         }
     }

     private static void catsEat(Cat cat, Plate plate) {

         while (plate.getFood() < cat.getAppetite()) {
            plate.addFood(10);
            plate.info();
         }
         cat.eat(plate);
         plate.info();
     }

}
