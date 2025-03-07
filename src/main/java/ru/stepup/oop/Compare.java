package ru.stepup.oop;

public class Compare {
    private Point p1;
    private Point p2;

    public Compare(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
    }

    public void doCompare() {
        System.out.println("First point: " + p1 +
                "\nSecont point: " + p2 +
                "\nResult: " + (p1.equals(p2)));
    }
}
