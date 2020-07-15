package Lesson06;

public class Sport {
    public static void main(String[] args) {

        int catRunDistance = 210;
        double catJumpHeigth = 2.2;
        int catSwimDistance = 100;

        int dogRunDistance = 550;
        double dogJumpHeigth = 0.9;
        int dogSwimDistance = 18;

        Cat cat1 = new Cat("Кот", 200, 2.0);
        Cat cat2 = new Cat("Пушок", 220, 2.2);

        Dog dog1 = new Dog("Котлета", 500, 1.2, 19);
        Dog dog2 = new Dog("Сосиска", 600, 0.2, 16);

        System.out.println("Кот по имени " + cat1.getName() + " пробежит " + catRunDistance + " м. ? (максимальная дистанция - " + cat1.getMaxRunLength() + ") - " + cat1.Run(catRunDistance));
        System.out.println("Кот по имени " + cat1.getName() + " перепрыгнет препятствие высотой " + catJumpHeigth + " м. ? (максимальная высота - " + cat1.getMaxJumpHeight() + ") - " + cat1.Jump(catJumpHeigth));
        System.out.println("Кот по имени " + cat1.getName() + " проплывёт " + catSwimDistance + "м. ? (максимальная дистанция - " + cat1.getMaxSwimLength() + ") - " + cat1.Swim(catSwimDistance));
        System.out.println("Кот по имени " + cat2.getName() + " пробежит " + catRunDistance + " м. ? (максимальная дистанция - " + cat2.getMaxRunLength() + ") - " + cat2.Run(catRunDistance));
        System.out.println("Кот по имени " + cat2.getName() + " перепрыгнет препятствие высотой " + catJumpHeigth + " м. ? (максимальная высота - " + cat2.getMaxJumpHeight() + ") - " + cat2.Jump(catJumpHeigth));
        System.out.println("Кот по имени " + cat2.getName() + " проплывёт " + catSwimDistance + "м. ? (максимальная дистанция - " + cat2.getMaxSwimLength() + ") - " + cat2.Swim(catSwimDistance));

        System.out.println();

        System.out.println("Собака по имени " + dog1.getName() + " пробежит " + dogRunDistance + " м. ? (максимальная дистанция - " + dog1.getMaxRunLength() + ") - " + dog1.Run(dogRunDistance));
        System.out.println("Собака по имени " + dog1.getName() + " перепрыгнет препятствие высотой " + dogJumpHeigth + " м. ? (максимальная высота - " + dog1.getMaxJumpHeight() + ") - " + dog1.Jump(dogJumpHeigth));
        System.out.println("Собака по имени " + dog1.getName() + " проплывёт " + dogSwimDistance + "м. ? (максимальная дистанция - " + dog1.getMaxSwimLength() + ") - " + dog1.Swim(dogSwimDistance));
        System.out.println("Собака по имени " + dog2.getName() + " пробежит " + dogRunDistance + " м. ? (максимальная дистанция - " + dog2.getMaxRunLength() + ") - " + dog2.Run(dogRunDistance));
        System.out.println("Собака по имени " + dog2.getName() + " перепрыгнет препятствие высотой " + dogJumpHeigth + " м. ? (максимальная высота - " + dog2.getMaxJumpHeight() + ") - " + dog2.Jump(dogJumpHeigth));
        System.out.println("Собака по имени " + dog2.getName() + " проплывёт " + dogSwimDistance + "м. ? (максимальная дистанция - " + dog2.getMaxSwimLength() + ") - " + dog2.Swim(dogSwimDistance));

    }

}
