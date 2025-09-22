package by.homework.lessons.task_4;

import java.util.Scanner;

public class SwitchOperator {
    // 3. Дано 15/x=result, где x-число, которое вводится с командной строки,
    // result-результат вычисления. Написать программу, которая будет выводит разный текст, в зависимости от значения result.
    // В случае result=3, вывести: "Результат деления равен 3" В случае result=5 вывести:
    // "Результат деления равен 5" В других случаях вывести: "Результат деления равен дробному числу".
    //При этом в последнем случае вывести точный результат деления (использовать приведение типов)
    //Для выполнения задания использовать оператор switch- case

    public static void main(String[] args) {
        System.out.println("*********Задача 3*************");
        Scanner in=new Scanner(System.in);
        System.out.println("Введите x");
        int x= in.nextInt();
        double y;


        switch (15/x){
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case  5:
                System.out.println("Результат деления равен 5");
                break;
            default :
                y= 15.00/x;
                System.out.println("Результат деления равен дробному числу " +y);
        }
    }



}
