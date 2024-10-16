package org.example;

public class Homework4_1 {
    void square(int arg) {

        System.out.println("Введено число: " + arg);
        System.out.println("Квадрат вашего числа = " + arg*arg);
    }

    public static void main(String[] args) {
        Homework4_1 object = new Homework4_1();
        object.square(4);
    }
}