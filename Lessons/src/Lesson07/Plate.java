package Lesson07;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public Plate() {
        this(0);
    }

    public void addFood(int food) {
        System.out.println("Положили еды " + food);
        this.food += food;
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "В миске {" +
                "еды = " + food +
                '}';
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int foodCount) {
        this.food -= foodCount;
    }

}
