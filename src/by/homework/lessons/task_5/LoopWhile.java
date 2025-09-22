package by.homework.lessons.task_5;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        //Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа до другого.
        // (Используйте цикл while).
        // Подсказка. До цикла объявите переменную int sum=0. В самом цикле перезаписывайте в эту переменную сумму чисел.
        Scanner in=new Scanner(System.in);
        System.out.println("Введите x");
        int x= in.nextInt();
        System.out.println("Введите y");
        int y= in.nextInt();

        // Убедимся, что числа положительные
        while (x <= 0 || y <= 0) {
            System.out.println("Пожалуйста, введите только положительные числа.");
        }

        // Определяем меньшее и большее число
        int min = Math.min(x, y);
        int max = Math.max(x, y);

        int sum = 0; // Объявление переменной для хранения суммы

        while (min <= max) {
            sum += min; // Добавляем текущее число к сумме
            min++;      // Переходим к следующему числу
        }

        // Вывод результата
        System.out.println("Сумма чисел от " + x + " до " + y + " равна: " + sum);
    }
}


