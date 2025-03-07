package ru.stepup.oop;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean compare() {
        return x==y;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y +'}';
    }
}
