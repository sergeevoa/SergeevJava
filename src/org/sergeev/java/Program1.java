package org.sergeev.java;

import java.util.Scanner;

/*Класс первой программы*/
public class Program1 {
    public static void executeProgram(Scanner in) {
        System.out.println("Начато выполнение первой программы\n");

        //Ввод данных
        System.out.println("Введите два целых числа:");
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();

        //Сравнение чисел и вывод результатов
        if (a == b) {
            System.out.println("a = b");
        }
        else if (a > b) {
            System.out.println("a > b");
        }
        else {
            System.out.println("a < b");
        }

        //Арифметические операции
        System.out.printf("a + b = %d%n", a + b);
        System.out.printf("a - b = %d%n", a - b);
        //Чтобы получать корректный результат деления, нужно преобразовать один из операндов в тип с плавающей точкой
        //Использована проверка деления на 0 при помощи тернарного оператора
        System.out.printf("a / b = %.2f%n", b != 0 ? (float)a / b : Float.NaN);
        System.out.printf("a * b = %d%n", a * b);

        System.out.println("\nПервая программа выполнена\n");
    }
}
