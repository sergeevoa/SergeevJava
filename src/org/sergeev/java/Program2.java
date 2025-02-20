package org.sergeev.java;

import java.util.Scanner;

public class Program2 {
    public static void executeProgram(Scanner in) {
        System.out.println("Начато выполнение второй программы\n");

        //Ввод строк
        in.nextLine();  //Очистка буфера после nextInt() в Main, чтобы корректно считывать строки
        System.out.print("Введите строку a: ");
        String a = in.nextLine();
        System.out.print("Введите строку b: ");
        String b = in.nextLine();

        //Сравнение и вывод результата
        System.out.println(a.equals(b) ? "Строки идентичны" : "Строки неидентичны");

        System.out.println("\nВторая программа выполнена\n");
    }
}
