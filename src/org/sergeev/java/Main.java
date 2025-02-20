package org.sergeev.java;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Конструкция try-with-resources использована для автоматического закрытия in после выхода из блока try
        try (Scanner in = new Scanner(System.in)) {
            boolean isRunning = true;

            while (isRunning) {
                System.out.println("Добро пожаловать в главное меню!");
                System.out.println("Введите 1 чтобы запустить программу № 1");
                System.out.println("Введите 2 чтобы запустить программу № 2");
                System.out.println("Введите 3 чтобы запустить программу № 3");
                System.out.println("Введите любое другое число чтобы завершить работу");

                //Если было введено число
                if (in.hasNextInt()) {
                    int num = in.nextInt();
                    switch (num) {
                        case 1:
                            Program1.executeProgram(in);
                            break;
                        case 2:
                            Program2.executeProgram(in);
                            break;
                        case 3:
                            Program3.executeProgram();
                            break;
                        default:
                            isRunning = false;
                    }
                } else { //В ином случае
                    System.out.println("Ошибка: введите число!\n\n");
                    in.next();  //Очистка некорректного ввода
                }
            }
        }
    }
}
