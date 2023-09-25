package org.example;

import java.util.Scanner;

public class HomeWork2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        /*
        Задача 1.
        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
        введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
        необходимо повторно запросить у пользователя ввод данных.
         */
        System.out.println("Task 1");
        System.out.println(enterNumber(scanner));

        /*
        Задание 2
        Если необходимо, исправьте данный код:
        ***
        try {
           int d = 0;
           double catchedRes1 = intArray[8] / d;
           System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
           System.out.println("Catching exception: " + e);
        }
        ***
        Исправленный код:
        int d = 0;
        if (d == 0) {
	        System.out.println("You can't divide by zero.");
        } elseif (intArray.length < 9) {
             System.out.println("Invalid array element index.");
        } else {
             double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
        }
       */

        /*
        Задача 3.
        Дан следующий код, исправьте его там, где требуется:
        ***
        public static void main(String[] args) throws Exception {
           try {
               int a = 90;
               int b = 3;
               System.out.println(a / b);
               printSum(23, 234);
               int[] abc = { 1, 2 };
               abc[3] = 9;
           } catch (Throwable ex) {
               System.out.println("Что-то пошло не так...");
           } catch (NullPointerException ex) {
               System.out.println("Указатель не может указывать на null!");
           } catch (IndexOutOfBoundsException ex) {
               System.out.println("Массив выходит за пределы своего размера!");
           }
        }
        public static void printSum(Integer a, Integer b) throws FileNotFoundException {
           System.out.println(a + b);
        }
        ***
         */
        System.out.println("Task 3");
        int a = 90;
        int b = 3;
        if (b != 0) System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        int i = 3;
        if (i < abc.length) abc[i] = 9;

        /*
        Задача 4.
        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю
        должно показаться сообщение, что пустые строки вводить нельзя.
         */
        System.out.println("Task 4");
        System.out.println(enterEmptyLine(scanner));

    }

    public static float enterNumber(Scanner scanner) {
        float number = 0;
        boolean correct = false;
        while (!correct) {
            System.out.print("Enter the number: ");
            String input = scanner.nextLine();
            try {
                number = Float.parseFloat(input);
                correct = true;
            } catch (NumberFormatException e) {
                System.out.println("Wrong entered value.");
            }
        }
        return number;
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static String enterEmptyLine(Scanner scanner) throws Exception {
        String line = "";
        System.out.print("Enter the line: ");
        String input = scanner.nextLine();
        if (input.length() == 0) {
            throw new Exception("You cannot enter an empty line.");
        } else {
            line = input;
        }
        return line;
    }
}