package ru.stepup.oop;

/*
Практика ООП. Объекты и классы #1. Точка координат
Создайте класс Точка, расположенную на двумерной плоскости, которая описывается:

Координата Х: число
Координата Y: число
При создании требует указать обе координаты
Может возвращать текстовое представление вида “{X;Y}”
Далее необходимо создать три объекта точки: {1;3} {1;3} {5;8}

Выведите на экран текстовое представление этих точек и результат сравнения точек между собой. Убедитесь, что оба сравнения дали false.
*/

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1,3);
        System.out.println(p1.toString());
        System.out.println(p1.compare());

        Point p2 = new Point(3,3);
        System.out.println(p2.toString());
        System.out.println(p2.compare());

        Point p3 = new Point(5,8);
        System.out.println(p3.toString());
        System.out.println(p3.compare());
    }
}