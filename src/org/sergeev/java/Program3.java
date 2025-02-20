package org.sergeev.java;

public class Program3 {
    public static void executeProgram() {
        System.out.println("Начато выполнение третьей программы программы\n");

        //Инициализация массива
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Вывод четных чисел
        System.out.println("Четные числа в массиве:");

        for(int i = 1; i < arr.length; i += 2) {
            //Все четные числа кроме последнего выводятся с запятой и пробелом после себя
            System.out.printf(arr[i] + (i < arr.length - 2 ? ", " : ""));
        }

        System.out.println("\n\nТретья программа выполнена\n");
    }
}
