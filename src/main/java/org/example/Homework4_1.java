package org.example;

public class Homework4_1 {
    void square(int arg) {

        System.out.println("Введено число: " + arg);
        System.out.println("Квадрат вашего числа = " + arg*arg);
        System.out.println();
    }
    void cylinder(double radius, double height) {
        System.out.printf("Объем цилиндра с %s радиусом и %s высотой = %s" ,radius, height, Math.PI*radius*radius*height);
        System.out.println();

    }
    void power(int a, int b) {
        System.out.println();
        System.out.printf("Число %s в степени %s = %s ", a, b, Math.pow(a,b));
        System.out.println();
    }
    public static void main(String[] args) {
        Homework4_1 object = new Homework4_1();
        object.square(4);
        object.cylinder(3.5,10 );
        object.power(2,3);
    }
}