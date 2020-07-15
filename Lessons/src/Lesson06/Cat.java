package Lesson06;

public class Cat extends Animals{


    public Cat(String name, int maxRunLength, double maxJumpHeight) {
        super(name, maxRunLength, maxJumpHeight, 0);
    }

    @Override
    public boolean Swim(int distance) {
        return false;
    }
}
