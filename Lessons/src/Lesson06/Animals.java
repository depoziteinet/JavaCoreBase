package Lesson06;

public class Animals implements DoSport {

    private final String name;
    private int maxRunLength;
    private double maxJumpHeight;
    private int maxSwimLength;

    public Animals(String name, int maxRunLength, double maxJumpHeight, int maxSwimLength) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimLength = maxSwimLength;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunLength() {
        return maxRunLength;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public int getMaxSwimLength() {
        return maxSwimLength;
    }

    public boolean Run(int distance){
        return maxRunLength >= distance;
    }

    public boolean Jump(double heigth){
        return maxJumpHeight >= heigth;
    }

    public boolean Swim(int distance){
        return maxSwimLength >= distance;
    }

}
