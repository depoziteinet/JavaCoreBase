package Lesson07;

public class Cat{

    protected final String name;
    private int appetite;
    private boolean satiety = false;

    public boolean isSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat (Plate plate) {
         System.out.println(name + " (аппетит = " + appetite + ") "  + " поел.");
         doEat(plate, appetite);
     }

    public void doEat(Plate plate, int numEat) {
        plate.decreaseFood(numEat);
    }
}
