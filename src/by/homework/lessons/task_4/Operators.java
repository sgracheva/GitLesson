package by.homework.lessons.task_4;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
//       1.На вход даны 3 числа. Вывести в консоль только четные числа
        System.out.println("*********Задача 1*************");
        Scanner in=new Scanner(System.in);
        System.out.println("Введите x");
        int x= in.nextInt();
        System.out.println("Введите y");
        int y= in.nextInt();
        System.out.println("Введите z");
        int z= in.nextInt();

        if (x%2==0)
        {
            System.out.println("Число " + x + " делится на 2");
        }if (y%2==0){
            System.out.println("Число " + y + " делится на 2");
        }
        if (z%2==0){
            System.out.println("Число " + z + " делится на 2");
        }
        else {
            System.out.println("Ни одно из трех чисел не является четным");
        }

//        2. На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5 (используйте оператор % для проверки деления без остатка)

        System.out.println("*********Задача 2*************");
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите x");
        int x1 = in2.nextInt();
        System.out.println("Введите y");
        int y1 = in2.nextInt();
        System.out.println("Введите z");
        int z1 = in2.nextInt();

        if (x1 % 2 == 0 && x1 % 5 == 0) {
            System.out.println("Число " + x1 + " делится на 2 и на 5");
        }
        if (y1 % 2 == 0 && y1 % 5 == 0) {
            System.out.println("Число " + y1 + " делится на 2 и на 5");
        }
        if (z1 % 2 == 0 && z1 % 5 == 0) {
            System.out.println("Число " + z1 + " делится на 2 и на 5");
        }else {
            System.out.println("Ни одно из трех чисел не делится на 2 и на 5");
        }

        // 3. Дано 15/x=result, где x-число, которое вводится с командной строки,
        // result-результат вычисления. Написать программу, которая будет выводит разный текст, в зависимости от значения result.
        // В случае result=3, вывести: "Результат деления равен 3" В случае result=5 вывести:
        // "Результат деления равен 5" В других случаях вывести: "Результат деления равен дробному числу".
        //При этом в последнем случае вывести точный результат деления (использовать приведение типов)
        //Для выполнения задания использовать оператор switch- case



    }
}
