package by.homework.lessons.task_5;

public class ForLoop {
    public static void main(String[] args) {
        //1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до100
        System.out.println("*****************Задача 1***************");

        for (int x = 1; x <= 100; x++) {
            if (x % 7 == 0 || x % 3 == 00) {

                System.out.println("Числа: " + x + " делятся на 3 или 7");
            }
        }
    }
}


